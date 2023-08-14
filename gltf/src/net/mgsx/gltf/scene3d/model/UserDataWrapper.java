package net.mgsx.gltf.scene3d.model;

public class UserDataWrapper {
    private final WeightVector morphTargets;

    private Object userData;

    public UserDataWrapper(WeightVector morphTargets, Object userData) {
        this.morphTargets = morphTargets;
        this.userData = userData;
    }

    public Object getUserData() {
        return userData;
    }

    public void setUserData(Object userData) {
        this.userData = userData;
    }

    public WeightVector getMorphTargets() {
        return morphTargets;
    }
}
