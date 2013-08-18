package com.moodletest;

<<<<<<< HEAD
import org.apache.http.HttpHost;
=======
>>>>>>> 09a53d1c5c4b45f3c1c58b914ac88f78401a9248
import org.apache.http.HttpVersion;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.HttpClient;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParams;
<<<<<<< HEAD
import org.apache.http.conn.params.ConnRoutePNames;
=======
>>>>>>> 09a53d1c5c4b45f3c1c58b914ac88f78401a9248
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

public class Client {
	public DefaultHttpClient httpClient;

	public Client()
	{
        // Create and initialize HTTP parameters
        HttpParams params = new BasicHttpParams();
        ConnManagerParams.setMaxTotalConnections(params, 100);
        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
        
        // Create and initialize scheme registry 
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(
                new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        
        // Create an HttpClient with the ThreadSafeClientConnManager.
        // This connection manager must be used if more than one thread will
        // be using the HttpClient.
<<<<<<< HEAD
        //HttpHost proxy = new HttpHost("192.168.0.22", 3128);
        
        ClientConnectionManager cm = new ThreadSafeClientConnManager(params, schemeRegistry);
        //httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
        //httpClient = new DefaultHttpClient(cm, params);
        httpClient = new DefaultHttpClient();
        //httpClient.getCredentialsProvider().setCredentials(new AuthScope("192.168.0.22", 3128, AuthScope.ANY_REALM, "basic"),
        //	    new UsernamePasswordCredentials("cs11b012", "xmEnEvolution"));
        //httpClient.getParams().setParameter(ConnRoutePNames.DEFAULT_PROXY, proxy);
        //httpClient.(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM, "basic"));
        //HttpClient httpClient = new DefaultHttpClient();
        //httpClient
=======
        ClientConnectionManager cm = new ThreadSafeClientConnManager(params, schemeRegistry);
        httpClient = new DefaultHttpClient(cm, params);
        httpClient.getCredentialsProvider().setCredentials(new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM, "basic"),
        	    new UsernamePasswordCredentials("cs11b012", "xmEnEvolution"));
        //HttpClient httpClient = new DefaultHttpClient();
>>>>>>> 09a53d1c5c4b45f3c1c58b914ac88f78401a9248
	}
}
