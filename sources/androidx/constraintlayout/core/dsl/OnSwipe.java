package androidx.constraintlayout.core.dsl;

/* JADX INFO: loaded from: classes.dex */
public class OnSwipe {
    public static final int FLAG_DISABLE_POST_SCROLL = 1;
    public static final int FLAG_DISABLE_SCROLL = 2;
    private Mode mAutoCompleteMode;
    private Drag mDragDirection;
    private float mDragScale;
    private float mDragThreshold;
    private String mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private TouchUp mOnTouchUp;
    private String mRotationCenterId;
    private Boundary mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private String mTouchAnchorId;
    private Side mTouchAnchorSide;

    public enum Boundary {
        OVERSHOOT,
        BOUNCE_START,
        BOUNCE_END,
        BOUNCE_BOTH
    }

    public enum Drag {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        START,
        END,
        CLOCKWISE,
        ANTICLOCKWISE
    }

    public enum Mode {
        VELOCITY,
        SPRING
    }

    public enum Side {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        MIDDLE,
        START,
        END
    }

    public enum TouchUp {
        AUTOCOMPLETE,
        TO_START,
        NEVER_COMPLETE_END,
        TO_END,
        STOP,
        DECELERATE,
        DECELERATE_COMPLETE,
        NEVER_COMPLETE_START
    }

    public OnSwipe() {
        this.mDragDirection = null;
        this.mTouchAnchorSide = null;
        this.mTouchAnchorId = null;
        this.mLimitBoundsTo = null;
        this.mOnTouchUp = null;
        this.mRotationCenterId = null;
        this.mMaxVelocity = Float.NaN;
        this.mMaxAcceleration = Float.NaN;
        this.mDragScale = Float.NaN;
        this.mDragThreshold = Float.NaN;
        this.mSpringDamping = Float.NaN;
        this.mSpringMass = Float.NaN;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = null;
        this.mAutoCompleteMode = null;
    }

    public Mode getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    public Drag getDragDirection() {
        return this.mDragDirection;
    }

    public float getDragScale() {
        return this.mDragScale;
    }

    public float getDragThreshold() {
        return this.mDragThreshold;
    }

    public String getLimitBoundsTo() {
        return this.mLimitBoundsTo;
    }

    public float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    public TouchUp getOnTouchUp() {
        return this.mOnTouchUp;
    }

    public String getRotationCenterId() {
        return this.mRotationCenterId;
    }

    public Boundary getSpringBoundary() {
        return this.mSpringBoundary;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    public String getTouchAnchorId() {
        return this.mTouchAnchorId;
    }

    public Side getTouchAnchorSide() {
        return this.mTouchAnchorSide;
    }

    public void setAutoCompleteMode(Mode mode) {
        this.mAutoCompleteMode = mode;
    }

    public OnSwipe setDragDirection(Drag drag) {
        this.mDragDirection = drag;
        return this;
    }

    public OnSwipe setDragScale(int i10) {
        this.mDragScale = i10;
        return this;
    }

    public OnSwipe setDragThreshold(int i10) {
        this.mDragThreshold = i10;
        return this;
    }

    public OnSwipe setLimitBoundsTo(String str) {
        this.mLimitBoundsTo = str;
        return this;
    }

    public OnSwipe setMaxAcceleration(int i10) {
        this.mMaxAcceleration = i10;
        return this;
    }

    public OnSwipe setMaxVelocity(int i10) {
        this.mMaxVelocity = i10;
        return this;
    }

    public OnSwipe setOnTouchUp(TouchUp touchUp) {
        this.mOnTouchUp = touchUp;
        return this;
    }

    public OnSwipe setRotateCenter(String str) {
        this.mRotationCenterId = str;
        return this;
    }

    public OnSwipe setSpringBoundary(Boundary boundary) {
        this.mSpringBoundary = boundary;
        return this;
    }

    public OnSwipe setSpringDamping(float f10) {
        this.mSpringDamping = f10;
        return this;
    }

    public OnSwipe setSpringMass(float f10) {
        this.mSpringMass = f10;
        return this;
    }

    public OnSwipe setSpringStiffness(float f10) {
        this.mSpringStiffness = f10;
        return this;
    }

    public OnSwipe setSpringStopThreshold(float f10) {
        this.mSpringStopThreshold = f10;
        return this;
    }

    public OnSwipe setTouchAnchorId(String str) {
        this.mTouchAnchorId = str;
        return this;
    }

    public OnSwipe setTouchAnchorSide(Side side) {
        this.mTouchAnchorSide = side;
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("OnSwipe:{\n");
        if (this.mTouchAnchorId != null) {
            sb2.append("anchor:'");
            sb2.append(this.mTouchAnchorId);
            sb2.append("',\n");
        }
        if (this.mDragDirection != null) {
            sb2.append("direction:'");
            sb2.append(this.mDragDirection.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.mTouchAnchorSide != null) {
            sb2.append("side:'");
            sb2.append(this.mTouchAnchorSide.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mDragScale)) {
            sb2.append("scale:'");
            sb2.append(this.mDragScale);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mDragThreshold)) {
            sb2.append("threshold:'");
            sb2.append(this.mDragThreshold);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mMaxVelocity)) {
            sb2.append("maxVelocity:'");
            sb2.append(this.mMaxVelocity);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mMaxAcceleration)) {
            sb2.append("maxAccel:'");
            sb2.append(this.mMaxAcceleration);
            sb2.append("',\n");
        }
        if (this.mLimitBoundsTo != null) {
            sb2.append("limitBounds:'");
            sb2.append(this.mLimitBoundsTo);
            sb2.append("',\n");
        }
        if (this.mAutoCompleteMode != null) {
            sb2.append("mode:'");
            sb2.append(this.mAutoCompleteMode.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (this.mOnTouchUp != null) {
            sb2.append("touchUp:'");
            sb2.append(this.mOnTouchUp.toString().toLowerCase());
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mSpringMass)) {
            sb2.append("springMass:'");
            sb2.append(this.mSpringMass);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mSpringStiffness)) {
            sb2.append("springStiffness:'");
            sb2.append(this.mSpringStiffness);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mSpringDamping)) {
            sb2.append("springDamping:'");
            sb2.append(this.mSpringDamping);
            sb2.append("',\n");
        }
        if (!Float.isNaN(this.mSpringStopThreshold)) {
            sb2.append("stopThreshold:'");
            sb2.append(this.mSpringStopThreshold);
            sb2.append("',\n");
        }
        if (this.mSpringBoundary != null) {
            sb2.append("springBoundary:'");
            sb2.append(this.mSpringBoundary);
            sb2.append("',\n");
        }
        if (this.mRotationCenterId != null) {
            sb2.append("around:'");
            sb2.append(this.mRotationCenterId);
            sb2.append("',\n");
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public OnSwipe(String str, Side side, Drag drag) {
        this.mLimitBoundsTo = null;
        this.mOnTouchUp = null;
        this.mRotationCenterId = null;
        this.mMaxVelocity = Float.NaN;
        this.mMaxAcceleration = Float.NaN;
        this.mDragScale = Float.NaN;
        this.mDragThreshold = Float.NaN;
        this.mSpringDamping = Float.NaN;
        this.mSpringMass = Float.NaN;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = null;
        this.mAutoCompleteMode = null;
        this.mTouchAnchorId = str;
        this.mTouchAnchorSide = side;
        this.mDragDirection = drag;
    }
}
