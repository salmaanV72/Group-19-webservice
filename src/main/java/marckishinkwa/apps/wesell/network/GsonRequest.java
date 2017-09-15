package marckishinkwa.apps.wesell.network;

import com.android.volley.AuthFailureError;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GsonRequest<T> extends Request<T>
{
	private Gson geeson = new Gson();
	private Class<T> klas;
	private Map< String, String> header;
	private Map< String, String> parm;
	private Response.Listener<T> listen;
	
	/**
     * Make a GET request and return a parsed object from JSON.
     */

	 public GsonRequest(int mthd, String url, Class<T> klas,Response.Listener<T> listen, Response.ErrorListener errList)
	 {
		 super(mthd, url, errList);
        this.klas = klas;
        this.listen = listen;
        geeson = new Gson();
    }
    /**
     * Make a POST request and return a parsed object from JSON.
     */
    public GsonRequest(int mthd, String url, Class<T> klas, Map<String, String> parm, Response.Listener<T> listen, Response.ErrorListener errList) 
	{
        super(mthd, url, errList);
        this.klas = klas;
        this.parm = parm;
        this.listen = listen;
        this.header = null;
        geeson = new Gson();
    }
    @Override
    public Map<String, String> getHeaders() throws AuthFailureError 
	{
        return header != null ? header : super.getHeaders();
    }
    @Override
    protected Map<String, String> getParams() throws AuthFailureError 
	{
        return parm;
    }
    @Override
    protected void deliverResponse(T response)
	{
        listen.onResponse(response);
    }
    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse respond) 
	{
        try 
		{
            String json = new String(respond.data, HttpHeaderParser.parseCharset(respond.headers));
            return Response.success(geeson.fromJson(json, klas), HttpHeaderParser.parseCacheHeaders(respond));
        } 
		catch (UnsupportedEncodingException e)
		{
            return Response.error(new ParseError(e));
        } 
		catch (JsonSyntaxException e) 
		{
            return Response.error(new ParseError(e));
        }
    }
}