package marckishinkwa.apps.wesell.network;

import android.app.Application;
import com.android.volley.RequestQueue;

public class CustomApplication extends Application
{
	private RequestQueue queueRequest;
	@Override
		public void onCreate()
		{
			super.onCreate();
			queueRequest = VolleySingleton.getInstance(getApplicationContext()).getRequestQueue();
		}
		public RequestQueue getVolleyRequestQueueCustomA()
		{
			return queueRequest;
		}
}