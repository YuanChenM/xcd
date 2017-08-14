package com.bms.common.rest.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.AsyncRestTemplate;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClientFactory {

    private static final int DEFAULT_CONNECT_TIMEOUT = 2000;
    private static final int DEFAULT_READ_TIMEOUT = 2000;
    private static final int DEFAULT_ASYNC_CONNECT_TIMEOUT = 2000;
    private static final int DEFAULT_ASYNC_READ_TIMEOUT = -1;
    @Value("${restclient.connectTimeout}")
    private int connectTimeout = DEFAULT_CONNECT_TIMEOUT;

    @Value("${restclient.readTimeout}")
    private int readTimeout = DEFAULT_READ_TIMEOUT;

    @Value("${restclient.asyncConnectTimeout}")
    private int asyncConnectTimeout = DEFAULT_ASYNC_CONNECT_TIMEOUT;

    @Value("${restclient.asyncReadTimeout}")
    private int asyncReadTimeout = DEFAULT_ASYNC_READ_TIMEOUT;
    @Value("${oms.interface.apiKey}")
    private String apiKey;
    @Value("${oms.interface.securityKey}")
    private String securityKey;

	private static AsyncRestTemplate asyncRestTemplate;

	private static RestTemplate restTemplate;

    public RestClient newRestClient() {
		if (null == restTemplate){
			restTemplate = getRestTemplate();
		}
        return new RestClient(connectTimeout, readTimeout, asyncConnectTimeout, asyncReadTimeout,apiKey,securityKey,restTemplate);
    }

    public AsyncRestClient newAsyncRestClient() {
		if(null == asyncRestTemplate){
			asyncRestTemplate = getAsyncRestTemplate();
		}
        return new AsyncRestClient(connectTimeout, readTimeout, asyncConnectTimeout, asyncReadTimeout,apiKey,securityKey,asyncRestTemplate);
    }

    /**
     * @return the connectTimeout
     */
    public int getConnectTimeout() {
        return connectTimeout;
    }

    /**
     * @param connectTimeout the connectTimeout to set
     */
    public void setConnectTimeout(int connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    /**
     * @return the readTimeout
     */
    public int getReadTimeout() {
        return readTimeout;
    }

    /**
     * @param readTimeout the readTimeout to set
     */
    public void setReadTimeout(int readTimeout) {
        this.readTimeout = readTimeout;
    }

    /**
     * @return the asyncConnectTimeout
     */
    public int getAsyncConnectTimeout() {
        return asyncConnectTimeout;
    }

    /**
     * @param asyncConnectTimeout the asyncConnectTimeout to set
     */
    public void setAsyncConnectTimeout(int asyncConnectTimeout) {
        this.asyncConnectTimeout = asyncConnectTimeout;
    }

    /**
     * @return the asyncReadTimeout
     */
    public int getAsyncReadTimeout() {
        return asyncReadTimeout;
    }

    /**
     * @param asyncReadTimeout the asyncReadTimeout to set
     */
    public void setAsyncReadTimeout(int asyncReadTimeout) {
        this.asyncReadTimeout = asyncReadTimeout;
    }


	protected AsyncRestTemplate getAsyncRestTemplate() {
		AsyncRestTemplate restTemplate = new AsyncRestTemplate();
		restTemplate.setErrorHandler(new RestResponseErrorHandler());
		restTemplate.setAsyncRequestFactory(getAsyncRequestFactory());
		return restTemplate;
	}

	private SimpleClientHttpRequestFactory getAsyncRequestFactory() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setTaskExecutor(new SimpleAsyncTaskExecutor());
		requestFactory.setConnectTimeout(asyncConnectTimeout);
		requestFactory.setReadTimeout(asyncReadTimeout);

		return requestFactory;
	}

	protected RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.setErrorHandler(new RestResponseErrorHandler());
		restTemplate.setRequestFactory(getRequestFactory());
		return restTemplate;
	}

	/**
	 * ��ȡSimpleClientHttpRequestFactory
	 *
	 * @return
	 */
	private SimpleClientHttpRequestFactory getRequestFactory() {
		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
		requestFactory.setConnectTimeout(connectTimeout);
		requestFactory.setReadTimeout(readTimeout);
		return requestFactory;
	}

}
