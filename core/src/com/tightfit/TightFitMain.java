package com.tightfit;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.tightfit.screen.MainScreen;
import com.tightfit.util.Assets;

public class TightFitMain extends Game{
	@Override
	public void create() {
		Assets.instance.init(new AssetManager());
		setScreen(new MainScreen());
	}

	@Override
	public void dispose() {
		super.dispose();
		Assets.instance.dispose();
	}

	@Override
	public void render() {
		super.render();
		Assets.assetManager.finishLoading();
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
		Assets.instance.init(new AssetManager());
	}
}
