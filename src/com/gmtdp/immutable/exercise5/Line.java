package com.gmtdp.immutable.exercise5;

public class Line {
	private final Point startPoint;
	private final Point endPoint;
	
	public Line(int startX, int startY, int endX, int endY) {
		this.startPoint = new Point(startX, startY);
		this.endPoint = new Point(endX, endY);
	}
	
	public Line(Point startPoint, Point endPoint) {
		this.startPoint = new Point(startPoint.x, startPoint.y);
		this.endPoint = new Point(endPoint.x, endPoint.y);
	}
	
	public int getStartX() { return startPoint.getX(); }
	public int getStartY() { return startPoint.getY(); }
	public int getEndX() { return endPoint.getX(); }
	public int getEndY() { return endPoint.getY(); }

	@Override
	public String toString() {
		return "[ Line: " + startPoint + "-" + endPoint + " ]";
	}
	
}
