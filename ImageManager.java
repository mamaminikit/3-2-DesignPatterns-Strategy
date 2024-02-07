/* Kitthanya Teachanontkullawat (Mine) 64050027 */
public class ImageManager { /* CONTEXT */
	private Strategy renderer;
    public void setRenderer(Strategy renderer) {
		this.renderer = renderer;
	}
	public void show() {
		this.renderer.showImage();
	}
}
