package net.mgsx.gltf.scene3d.model;

import com.badlogic.gdx.graphics.g3d.Renderable;
import com.badlogic.gdx.graphics.g3d.model.NodePart;

/**
 * {@link NodePart} hack to store morph targets
 */
public class NodePartPlus extends NodePart{
	
	/**
	 * null if no morph targets
	 */
	public WeightVector morphTargets;

	public Renderable setRenderable (final Renderable out) {
		out.material = material;
		out.meshPart.set(meshPart);
		out.bones = bones;
		out.userData = new UserDataWrapper(morphTargets, out.userData);
		return out;
	}
	
	@Override
	public NodePart copy() {
		return new NodePartPlus().set(this);
	}
	
	@Override
	protected NodePart set(NodePart other) {
		super.set(other);
		if(other instanceof NodePartPlus){
			morphTargets = ((NodePartPlus) other).morphTargets;
		}
		return this;
	}
}
