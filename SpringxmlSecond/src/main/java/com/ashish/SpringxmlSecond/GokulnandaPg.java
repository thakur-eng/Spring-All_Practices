package com.ashish.SpringxmlSecond;

public class GokulnandaPg {

	String pgname;
	String honername;
	String totalRoom;
	String foodItem;
	String breakfast;
	String lunch;
	String deenar;
	String pgAdd;
	String pgRent;

	public String getPgname() {
		return pgname;
	}

	public void setPgname(String pgname) {
		this.pgname = pgname;
	}

	public String getHonername() {
		return honername;
	}

	public void setHonername(String honername) {
		this.honername = honername;
	}

	public String getTotalRoom() {
		return totalRoom;
	}

	public void setTotalRoom(String totalRoom) {
		this.totalRoom = totalRoom;
	}

	public String getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(String foodItem) {
		this.foodItem = foodItem;
	}

	public String getBreakfast() {
		return breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.breakfast = breakfast;
	}

	public String getLunch() {
		return lunch;
	}

	public void setLunch(String lunch) {
		this.lunch = lunch;
	}

	public String getDeenar() {
		return deenar;
	}

	public void setDeenar(String deenar) {
		this.deenar = deenar;
	}

	public String getPgAdd() {
		return pgAdd;
	}

	public void setPgAdd(String pgAdd) {
		this.pgAdd = pgAdd;
	}

	public String getPgRent() {
		return pgRent;
	}

	public void setPgRent(String pgRent) {
		this.pgRent = pgRent;
	}

	public void pgDetails() {

		System.out.println("pgname" + pgname + "  honername" + honername + "  totalRoom" + totalRoom + "  foodItem"
				+ foodItem + "  breakfast" + breakfast + "  lunch" + lunch + "  deenar" + deenar + "  pgAdd" + pgAdd
				+ "  pgRent" + pgRent);
	}

}
