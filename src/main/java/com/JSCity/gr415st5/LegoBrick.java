package com.JSCity.gr415st5;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.coords.*;
import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.models.Sphere;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;
import eu.printingin3d.javascad.coords.Coords3d;

class LegoBrick extends Union {
	LegoBrick() {
		super(getModels());
	}

	private static List<Abstract3dModel> getModels() {
		List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();
		Union first = new Union(
				new Cylinder(180, 150).move(Coords3d.zOnly(20)),
				new Cylinder(50, 100, 40).move(Coords3d.zOnly(110)),
				new Cylinder(40, 200, 150).move(Coords3d.zOnly(40)),
				new Cylinder(40, 200).move(Coords3d.zOnly(-65)),
				new Cylinder(60, 50, 130).move(Coords3d.zOnly(-100)),
				new Cylinder(20, 80).move(Coords3d.zOnly(-140)),
				new Cube(new Dims3d(100, 250, 20)).move(new Coords3d(0, 300, -75))

		);

		Difference second = new Difference(
				first,
				new Sphere(30).move(new Coords3d(0, 150, 110)),
				new Sphere(30).move(new Coords3d(150, 0, 110)),
				new Sphere(30).move(new Coords3d(0, -150, 110)),
				new Sphere(30).move(new Coords3d(-150, 0, 110)),
				new Sphere(30).move(new Coords3d(110, 110, 110)),
				new Sphere(30).move(new Coords3d(-110, -110, 110)),
				new Sphere(30).move(new Coords3d(-110, 110, 110)),
				new Sphere(30).move(new Coords3d(110, -110, 110)),
				new Cylinder(30, 190).move(Coords3d.zOnly(-55))
		);
		Union third = new Union(
				second,
				new Cylinder(40,150).move(Coords3d.zOnly(-60)),
				new Cube(new Dims3d(5, 230, 25)).move(new Coords3d(-50, 310, -55)),
				new Cube(new Dims3d(5, 230, 25)).move(new Coords3d(50, 310, -55)),
				new Cube(new Dims3d(5, 150, 25)).rotate(new Angles3d(-40,0,0)).move(new Coords3d(-50, 190, -5)),
				new Cube(new Dims3d(5, 150, 25)).rotate(new Angles3d(-40,0,0)).move(new Coords3d(50, 190, -5))
		);
		Difference forth = new Difference(
				third,
				new Cube(new Dims3d(50, 100, 80)).move(new Coords3d(0, 150, -30)),
				new Cube(new Dims3d(15,15,15)).move(new Coords3d(150, 0, 0)),
				new Cube(new Dims3d(15,15,15)).move(new Coords3d(0, -150, 0)),
				new Cube(new Dims3d(15,15,15)).move(new Coords3d(-150, 0, 0)),
				new Cube(new Dims3d(30,15,15)).move(new Coords3d(110, 110, 0)),
				new Cube(new Dims3d(30,15,15)).move(new Coords3d(-110, -110, 0)),
				new Cube(new Dims3d(30,15,15)).move(new Coords3d(-110, 110, 0)),
				new Cube(new Dims3d(30,15,15)).move(new Coords3d(110, -110, 0))
		);
		models.add(forth);
		return models;
	}
}