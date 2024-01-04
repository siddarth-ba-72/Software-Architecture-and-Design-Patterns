package DesignPatterns.BehavioralDesignPatterns.StrategyPattern.Task.Solution;

public class ImageManager {

    private Renderer renderer;

    public void setDevice(Renderer renderer) {
        this.renderer = renderer;
    }

    public void execute(){
        renderer.showImage();
    }
}
