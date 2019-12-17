package dataStructure;

import utils.Point3D;

public class node implements node_data{
	private int key, tag;
	private Point3D location;
	private Double weight;
	private String info;


	//****************constructors******************
	public node() {
		key = 0;
		tag = 0;
		weight =0.0;
		location = null;
		info = "";
	}

	public node(int key, Point3D location, Double Weight, String info, int tag) {
		this.key = key;
		this.info = info;
		this.weight = Weight;
		this.location = location;
		this.tag = tag;
	}

	public node(node other) {
		this.key = other.key;
		this.weight = other.weight;
		this.location = other.location;
		this.info = other.info;
		this.tag = other.tag;
	}

	@Override
	public int getKey() {
		return key;
	}

	@Override
	public Point3D getLocation() {
		return location;
	}

	@Override
	public void setLocation(Point3D p) {
		location = p;
	}

	@Override
	public double getWeight() {
		return weight;
	}

	@Override
	public void setWeight(double w) {
		weight = w;
	}

	@Override
	public String getInfo() {
		return info;
	}

	@Override
	public void setInfo(String s) {
		info = s;
	}

	@Override
	public int getTag() {
		return tag;
	}

	@Override
	public void setTag(int t) {
		tag = t;
	}

}
