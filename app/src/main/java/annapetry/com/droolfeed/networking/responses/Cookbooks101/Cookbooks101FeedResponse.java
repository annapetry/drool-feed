package annapetry.com.droolfeed.networking.responses.Cookbooks101;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Anna Petry on 3/26/18.
 * Copyright (c) 2018 Mango Health. All rights reserved.
 */

@Root(name = "rss")
public class Cookbooks101FeedResponse {
	Cookbooks101FeedResponse() { }

	@Element(name = "channel")
	private Cookbooks101Channel channel;

	public Cookbooks101Channel getChannel() {
		return channel;
	}
}