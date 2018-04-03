package annapetry.com.droolfeed.networking.responses.Cookbooks101;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.Root;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anna Petry on 3/27/18.
 * Copyright (c) 2018 Mango Health. All rights reserved.
 */
@Root(name = "channel", strict = false)
public class Cookbooks101Channel {
	Cookbooks101Channel() { }

	@ElementList(inline = true, name = "item", required = false)
	private List<Cookbooks101Item> items;

	public List<Cookbooks101Item> getItems() {
		return items;
	}

	@Element(name = "image")
	private Cookbooks101Image image;

	public Cookbooks101Image getImage() {
		return  image;
	}

	public List<String> getCategories() {
		List<String> categories = new ArrayList<>();
		for (Cookbooks101Item item : getItems()) {
			if (!categories.contains(item.getCategory()))
				categories.add(item.getCategory());
		}

		return categories;
	}
}
