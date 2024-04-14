package com.creationalDesignPatterns.CreationalDesignPatterns;

import com.creationalDesignPatterns.CreationalDesignPatterns.Builder.BuilderPatternDemo;
import com.creationalDesignPatterns.CreationalDesignPatterns.Factory.FactoryClass;
//import com.creationalDesignPatterns.CreationalDesignPatterns.Factory.Shape;
import com.creationalDesignPatterns.CreationalDesignPatterns.Prototype.PrototypePatternDemo;
import com.creationalDesignPatterns.CreationalDesignPatterns.Prototype.Shape;
import com.creationalDesignPatterns.CreationalDesignPatterns.Prototype.ShapeCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class CreationalDesignPatternsApplication {

	public static void main(String[] args) throws CloneNotSupportedException {

		BuilderPatternDemo bp = new BuilderPatternDemo();
		bp.demo();

	}

}
