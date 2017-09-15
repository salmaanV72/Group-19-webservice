package marckishinkwa.apps.wesell.network;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

public class VolleySingleton 
{
    private static VolleySingleton instnc;
    private RequestQueue QueuingR;
    private ImageLoader loadImg;
    private static Context cntxt;
	
    private VolleySingleton(Context context)
	{
        cntxt = context;
        QueuingR = getRequestQueue();
        loadImg = new ImageLoader(QueuingR, new ImageLoader.ImageCache()
		{
            private final LruCache<String, Bitmap> cache = new LruCache<String, Bitmap>(20);
            @Override
            public Bitmap getBitmap(String url) 
			{
                return cache.get(url);
            }
            @Override
            public void putBitmap(String url, Bitmap btmp)
			{
                cache.put(url, btmp);
            }
        });
    }
    public static synchronized VolleySingleton getInstance(Context context) 
	{
        if (instnc == null) 
		{
            instnc = new VolleySingleton(context);
        }
        return instnc;
    }
    public RequestQueue getRequestQueue()
	{
        if (QueuingR == null) 
		{
            QueuingR = Volley.newRequestQueue(cntxt.getApplicationContext());
        }
        return QueuingR;
    }
    public <T> void addToRequestQueue(Request<T> req) 
	{
        getRequestQueue().add(req);
    }
    public ImageLoader getImageLoader() 
	{
        return loadImg;
    }
}
