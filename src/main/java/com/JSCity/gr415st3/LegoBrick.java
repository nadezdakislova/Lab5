package com.JSCity.gr415st3;

import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.coords.Angles3d;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

class HC_building extends Union {


	HC_building() {super(getModels());}

	private static List<Abstract3dModel> getModels() {
		//полная модель
		List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();

		Union first = new Union(
				//здание
				new Cube(new Dims3d(1000, 1800, 400)).move(new Coords3d(0, 100, 105)),
				new Cube(new Dims3d(1000, 650, 700)).move(new Coords3d(0, -1125, 255)),
				new Cube(new Dims3d(480,500,250)).move(new Coords3d(-210,375,430)),
				new Cube(new Dims3d(580,925,270)).move(new Coords3d(-210,-338,440)),
				//крыша гаража

				new Cube(new Dims3d(750,500,20)).rotate(new Angles3d(-35,0,0)).move(new Coords3d(125,-975,740)),
				new Cube(new Dims3d(1000,500,20)).rotate(new Angles3d(35,0,0)).move(new Coords3d(0,-1275,740)),
				new Cube(new Dims3d(400,700,20)).rotate(new Angles3d(0,45,0)).move(new Coords3d(370,-1125,740)),
				//крыша здания
				new Cube(new Dims3d(550,1900,20)).move(new Coords3d(195,150,415)).rotate(Angles3d.yOnly(15)),
				new Cube(new Dims3d(1100,500,20)).move(new Coords3d(10,741,568)).rotate(Angles3d.xOnly(-15)),
				new Cube(new Dims3d(50,900,100)).move(new Coords3d(-475,575,355)),
				//крыша между гаражом и дачей
				new Cube(new Dims3d(550,1275,20)).rotate(new Angles3d(0,45,0)).move(new Coords3d(-100,-514,765)),
				new Cube(new Dims3d(550,1575,20)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(-330,-665,765)),
				new Cube(new Dims3d(580,20,320)).move(new Coords3d(-210,100,730)),

				//крыша балкона
				new Cube(new Dims3d(20,500,388)).rotate(new Angles3d(0,45,0)).move(new Coords3d(-340,380,680)),
				new Cube(new Dims3d(20,500,388)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(-80,380,680)),
				new Cube(new Dims3d(500,20,260)).move(new Coords3d(-210,605,685))
				//new Prism(500, 30, 0,4).move(new Coords3d(0, 0, 800))
		);
				//обрезание предметов
		Difference second = new Difference(first,
				//крыша между гаражом и дачей
				new Cube(new Dims3d(200, 425, 200)).rotate(new Angles3d(-45,-45,0)).move(new Coords3d(-100, -975, 922)),
				new Cube(new Dims3d(700, 100, 200)).rotate(new Angles3d(55,0,0)).move(new Coords3d(225, -1130, 923)),
				new Cube(new Dims3d(100, 100, 200)).rotate(new Angles3d(55,0,0)).move(new Coords3d(-115, -1157, 942)),
				new Cube(new Dims3d(100,1050,150)).rotate(new Angles3d(0,45,0)).move(new Coords3d(-130,-400,919)),
				new Cube(new Dims3d(550,1580,210)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(-410,-666,848)),
				//крыша гаража
				new Cube(new Dims3d(1050,500,350)).rotate(new Angles3d(35,0,0)).move(new Coords3d(0,-1375,896)),
				new Cube(new Dims3d(400,700,200)).rotate(new Angles3d(0,45,0)).move(new Coords3d(446,-1125,820)),
				new Cube(new Dims3d(400,500,250)).rotate(new Angles3d(-35,0,0)).move(new Coords3d(300,-900,853)),
				//крыша здания
				new Cube(new Dims3d(250,250,490)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(0,-5,859)),
				//балкон
				new Cube(new Dims3d(250,50,388)).rotate(new Angles3d(0,45,0)).move(new Coords3d(-440,620,773)),
				new Cube(new Dims3d(250,50,388)).rotate(new Angles3d(0,-45,0)).move(new Coords3d(20,620,773)),
				new Cube(new Dims3d(550,500,180)).move(new Coords3d(195,850,515)).rotate(Angles3d.yOnly(15)),
				new Cube(new Dims3d(1200,500,180)).move(new Coords3d(60,742,669)).rotate(Angles3d.xOnly(-15)),

				new Cube(new Dims3d(440,450,200)).move(new Coords3d(-210,375,410)),
				new Cube(new Dims3d(500,450,100)).move(new Coords3d(-205,375,490)),
				new Cube(new Dims3d(440,450,100)).move(new Coords3d(-205,405,490)),

				//окно гаража
				new Cube(new Dims3d(970, 610, 400)).move(new Coords3d(0, -1125, 370)),
				new Cube(new Dims3d(100,100,120)).move(new Coords3d(500,-1110,450)),
				new Cylinder(30,50).rotate(new Angles3d(0,90,0)).move(new Coords3d(500,-1110,500)),
				new Cube(new Dims3d(250, 100, 200)).move(new Coords3d(0, -1425, 450)),
				//помещение дачи
				new Cube(new Dims3d(500, 1450, 250)).move(new Coords3d(205, -90, 140)),//120
				//3 окна дачи
				new Cube(new Dims3d(100,200,90)).move(new Coords3d(500,-600,80)),
				new Cube(new Dims3d(100,200,90)).move(new Coords3d(500,-300,80)),
				new Cube(new Dims3d(100,200,90)).move(new Coords3d(500,0,80)),
				new Cylinder(100,100).rotate(new Angles3d(0,90,0)).move(new Coords3d(500,-600,145)),
				new Cylinder(100,100).rotate(new Angles3d(0,90,0)).move(new Coords3d(500,-300,145)),
				new Cylinder(100,100).rotate(new Angles3d(0,90,0)).move(new Coords3d(500,0,145)),



				new Cube(new Dims3d(300,50,315)).move(new Coords3d(265,975,100)),
				new Cube(new Dims3d(300,50,275)).move(new Coords3d(265,925,120)),
				new Cube(new Dims3d(300,50,230)).move(new Coords3d(265,875,142)),
				new Cube(new Dims3d(300,177,180)).move(new Coords3d(265,763,167)),//265,
				new Cube(new Dims3d(100,50,120)).move(new Coords3d(265,650,140)),
				new Cylinder(100,50).rotate(new Angles3d(90,0,0)).move(new Coords3d(265,650,200))
		);
		models.add(second);
		return models;
	}
}