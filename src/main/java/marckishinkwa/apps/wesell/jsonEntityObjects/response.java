package marckishinkwa.apps.wesell.jsonEntityObjects;

public class response
{
    private String create_time;
    private String id;
    private String ntnt;
    private String state;
	
    public response(String create_time, String id, String ntnt, String state) 
	{
        this.create_time = create_time;
        this.id = id;
        this.ntnt = ntnt;
        this.state = state;
    }
	
    public String getCreate_time() 
	{
        return create_time;
    }
	
    public String getId() 
	{
        return id;
    }
	
    public String getntnt() 
	{
        return ntnt;
    }
	
    public String getState() 
	{
        return state;
    }
}
