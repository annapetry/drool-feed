package annapetry.com.droolfeed.networking.responses.Cookbooks101;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Anna Petry on 3/28/18.
 * Copyright (c) 2018 Mango Health. All rights reserved.
 */
@Root(name = "image", strict = false)
public class Cookbooks101Image {
	Cookbooks101Image() { }

	@Element
	private String url;

	public String getUrl() {
		return url;
	}
}