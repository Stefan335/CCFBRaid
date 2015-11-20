package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

import javafx.scene.control.RadioButton;

public class RAID2 extends ApplicationAdapter {
	SpriteBatch batch;
	Texture imgCan1, imgCan2, imgCan3, imgCan4, imgthing;
	Sprite spCan1, spCan2, spCan3, spCan4, thing;
	int nNum=0, thingX=100, thingY=0;
	@Override
	public void create () {

		batch = new SpriteBatch();
		imgCan1 = new Texture("raidant copy.png");
		imgCan2 = new Texture("raidfly copy.png");
		imgCan3 = new Texture("RAIDBIG copy.png");
		imgCan4 = new Texture("RAIDMAX copy.png");
		imgthing = new Texture("ant1.png");
		spCan1= new Sprite(imgCan1);
		spCan2= new Sprite(imgCan2);
		spCan3= new Sprite(imgCan3);
		spCan4= new Sprite(imgCan4);
		thing= new Sprite(imgthing);
		spCan1.setSize(100, 100);
		spCan2.setSize(100, 100);
		spCan3.setSize(100, 100);
		spCan4.setSize(100, 100);
		spCan1.setPosition(Gdx.graphics.getWidth() - 100,
				Gdx.graphics.getHeight() - 100);
		spCan2.setPosition(Gdx.graphics.getWidth() - 100,
				Gdx.graphics.getHeight() - 200);
		spCan3.setPosition(Gdx.graphics.getWidth() - 100,
				Gdx.graphics.getHeight() - 300);
		spCan4.setPosition(Gdx.graphics.getWidth() - 100,
				Gdx.graphics.getHeight() - 400);
	}

	@Override
	public void render () {
		if(Gdx.input.isButtonPressed(Input.Buttons.LEFT)) {
			if (Gdx.input.getX() >= spCan1.getX()) {
				if (Gdx.input.getY() >= spCan4.getY() && Gdx.input.getY() < spCan4.getY() + spCan4.getHeight()) {
					if(nNum==0) {
						spCan2.setPosition(Gdx.graphics.getWidth() - 200,
								Gdx.graphics.getHeight() - 100);
						nNum=1;
					}
					else{
						spCan2.setPosition(Gdx.graphics.getWidth() - 100,
								Gdx.graphics.getHeight() - 200);
						nNum=0;
					}
				}
				if (Gdx.input.getY() >= spCan3.getY() && Gdx.input.getY() < spCan3.getY() + spCan3.getHeight()) {
					if(nNum==0) {
						spCan3.setPosition(Gdx.graphics.getWidth() - 200,
								Gdx.graphics.getHeight() - 100);
						nNum=1;
					}
					else{
						spCan3.setPosition(Gdx.graphics.getWidth() - 100,
								Gdx.graphics.getHeight() - 300);
						nNum=0;
					}
				}
				if (Gdx.input.getY() >= spCan2.getY() && Gdx.input.getY() < spCan2.getY() + spCan2.getHeight()) {
					if(nNum==0) {
						spCan4.setPosition(Gdx.graphics.getWidth() - 200,
								Gdx.graphics.getHeight() - 100);
						nNum=1;
					}
					else{
						spCan4.setPosition(Gdx.graphics.getWidth() - 100,
								Gdx.graphics.getHeight() - 400);
						nNum=0;
					}
				}

			}
		}
		if(thingX<=spCan1.getX()+1){
			thingX += 1;
		}
		if(thingX>=spCan1.getX()){
			if(thingX>=100){
				thingX -= 100;
			}
		}
		//Problems with clicking on image locations. For unknown reasons the y-coordinates seem to be
		//working improperly. Eg; the positions of Can2 and Can4 seem to be flipped with each others
		//when trying to click the images, to move Can1 the bottom right corner must be pressed as
		//opposed to the top, and Can3 works when clicked but in order to place the image back in
		//its original location the bottom right must be clicked again.
		// I will try my hardest to fix this ASAP
		Gdx.gl.glClearColor(1, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		spCan1.draw(batch);
		spCan2.draw(batch);
		spCan3.draw(batch);
		spCan4.draw(batch);
		batch.draw(thing, (int)thingX, (int)thingY);
		batch.end();
	}
}
