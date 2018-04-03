package annapetry.com.droolfeed.networking.responses.Cookbooks101;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import annapetry.com.util.StringUtil;

/**
 * Created by Anna Petry on 3/27/18.
 * Copyright (c) 2018 Mango Health. All rights reserved.
 */
@Root(name = "item", strict = false)
public class Cookbooks101Item {

	@Element(name = "title", required = false)
	private String title;

	public String getTitle() {
		return title;
	}

	@Element(name = "description", required = false)
	private String description;

	public String getImage() {
		Document document = Jsoup.parse(description);
		org.jsoup.nodes.Element imageElement = document.select("img").first();
		String urlString = imageElement.attr("src");
		String queryParams = "?" + StringUtil.getQueryparams(urlString);
		return urlString.replace(queryParams, "");
	}

	@Namespace(prefix = "dc", reference = "http://purl.org/dc/elements/1.1/")
	@Element(name = "subject", required = false)
	private String category;

	public String getCategory() {
		return category;
	}

	@Namespace(prefix = "feedburner", reference = "http://rssnamespace.org/feedburner/ext/1.0")
	@Element(name = "origLink", required = false)
	private String link;

	public String getLink() {
		return link;
	}
}
