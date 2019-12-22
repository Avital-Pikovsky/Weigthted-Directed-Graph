package dataStructure;

import java.io.Serializable;

public class Edge implements edge_data, Serializable{

	private int src, dest, tag;
	private double weigth;
	private String info;
	
	public Edge() {
		src = 0;
		dest = 0;
		tag = 0;
		weigth = 0.0;
		info = "";
	}
	
	public Edge(int src, int dest, int tag, double weigth, String info) {
		this.src = src;
		this.dest = dest;
		this.tag = tag;
		this.weigth = weigth;
		this.info = info;
	}
	
	public Edge(Edge other) {
		this.src = other.src;
		this.dest = other.dest;
		this.tag = other.tag;
		this.weigth = other.weigth;
		this.info = other.info;
	}
	
	@Override
	public int getSrc() {
		return src;
	}

	@Override
	public int getDest() {
		return dest;
	}

	@Override
	public double getWeight() {
		return weigth;
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
