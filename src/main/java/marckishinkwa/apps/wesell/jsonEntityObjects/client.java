package marckishinkwa.apps.wesell.jsonEntityObjects;

public class client
{
    private String enviro;
    private String paypal_sdk_version;
    private String platF;
    private String prdct_nm;
	
    public client(String enviro, String paypal_sdk_version, String platF, String prdct_nm) 
	{
        this.enviro = enviro;
        this.paypal_sdk_version = paypal_sdk_version;
        this.platF = platF;
        this.prdct_nm = prdct_nm;
    }
	
    public String getEnviro() 
	{
        return enviro;
    }
	
    public String getPaypal_sdk_version() 
	{
        return paypal_sdk_version;
    }
	
    public String getPlatform() 
	{
        return platF;
    }
	
    public String getProduct_name() 
	{
        return prdct_nm;
    }
}
