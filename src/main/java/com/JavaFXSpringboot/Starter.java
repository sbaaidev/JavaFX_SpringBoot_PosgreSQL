package com.JavaFXSpringboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import com.JavaFXSpringboot.view.EtudiantView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
@Lazy
@SpringBootApplication
public class Starter extends AbstractJavaFxApplicationSupport{
	
	public static void main(String[] args) {
		launchApp(Starter.class,EtudiantView.class, args);
		
	}
	
}
