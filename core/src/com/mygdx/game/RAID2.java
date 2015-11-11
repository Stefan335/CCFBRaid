package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RAID2 extends ApplicationAdapter {
	SpriteBatch batch;
	Texture imgCan1, imgCan2, imgCan3, imgCan4;
	Sprite spriteCan1, spriteCan2, spriteCan3, spriteCan4;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		imgCan1 = new Texture("raidant.jpg");
		imgCan2 = new Texture("raidfly.jpg");
		imgCan3 = new Texture("RAIDBIG.jpg");
		imgCan4 = new Texture("RAIDMAX.jpg");
		spriteCan1= new Sprite(imgCan1);
		spriteCan2= new Sprite(imgCan2);
		spriteCan3= new Sprite(imgCan3);
		spriteCan4= new Sprite(imgCan4);
		spriteCan1.setScale(0.1f);
		spriteCan2.setScale(0.2f);
		spriteCan3.setScale(0.333333333333333333333333333333333333333333333333333f);
		spriteCan4.setScale(0.25f);
		spriteCan4.setRotation(0f);
		spriteCan1.setPosition(Gdx.graphics.getWidth() - 550,
				Gdx.graphics.getHeight() - 625);
		spriteCan2.setPosition(Gdx.graphics.getWidth() - 300,
				Gdx.graphics.getHeight() - 475);
		spriteCan3.setPosition(Gdx.graphics.getWidth() - 193,
				Gdx.graphics.getHeight() - 475);
		spriteCan4.setPosition(Gdx.graphics.getWidth() - 250,
				Gdx.graphics.getHeight() - 625);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		spriteCan4.draw(batch);
		spriteCan2.draw(batch);
		spriteCan3.draw(batch);
		spriteCan1.draw(batch);
		batch.end();
	}
}
