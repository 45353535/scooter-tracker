package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.motion.utils.ViewSpline;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.R;
import com.google.common.base.Ascii;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class KeyTrigger extends Key {
    public static final String CROSS = "CROSS";
    public static final int KEY_TYPE = 5;
    static final String NAME = "KeyTrigger";
    public static final String NEGATIVE_CROSS = "negativeCross";
    public static final String POSITIVE_CROSS = "positiveCross";
    public static final String POST_LAYOUT = "postLayout";
    private static final String TAG = "KeyTrigger";
    public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
    public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
    public static final String TRIGGER_ID = "triggerID";
    public static final String TRIGGER_RECEIVER = "triggerReceiver";
    public static final String TRIGGER_SLACK = "triggerSlack";
    public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
    public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
    public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";
    RectF mCollisionRect;
    private String mCross;
    private int mCurveFit;
    private boolean mFireCrossReset;
    private float mFireLastPos;
    private boolean mFireNegativeReset;
    private boolean mFirePositiveReset;
    private float mFireThreshold;
    HashMap<String, Method> mMethodHashMap;
    private String mNegativeCross;
    private String mPositiveCross;
    private boolean mPostLayout;
    RectF mTargetRect;
    private int mTriggerCollisionId;
    private View mTriggerCollisionView;
    private int mTriggerID;
    private int mTriggerReceiver;
    float mTriggerSlack = 0.1f;
    int mViewTransitionOnCross;
    int mViewTransitionOnNegativeCross;
    int mViewTransitionOnPositiveCross;

    private static class Loader {
        private static final int COLLISION = 9;
        private static final int CROSS = 4;
        private static final int FRAME_POS = 8;
        private static final int NEGATIVE_CROSS = 1;
        private static final int POSITIVE_CROSS = 2;
        private static final int POST_LAYOUT = 10;
        private static final int TARGET_ID = 7;
        private static final int TRIGGER_ID = 6;
        private static final int TRIGGER_RECEIVER = 11;
        private static final int TRIGGER_SLACK = 5;
        private static final int VT_CROSS = 12;
        private static final int VT_NEGATIVE_CROSS = 13;
        private static final int VT_POSITIVE_CROSS = 14;
        private static SparseIntArray sAttrMap;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sAttrMap = sparseIntArray;
            sparseIntArray.append(R.styleable.KeyTrigger_framePosition, 8);
            sAttrMap.append(R.styleable.KeyTrigger_onCross, 4);
            sAttrMap.append(R.styleable.KeyTrigger_onNegativeCross, 1);
            sAttrMap.append(R.styleable.KeyTrigger_onPositiveCross, 2);
            sAttrMap.append(R.styleable.KeyTrigger_motionTarget, 7);
            sAttrMap.append(R.styleable.KeyTrigger_triggerId, 6);
            sAttrMap.append(R.styleable.KeyTrigger_triggerSlack, 5);
            sAttrMap.append(R.styleable.KeyTrigger_motion_triggerOnCollision, 9);
            sAttrMap.append(R.styleable.KeyTrigger_motion_postLayoutCollision, 10);
            sAttrMap.append(R.styleable.KeyTrigger_triggerReceiver, 11);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnCross, 12);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnNegativeCross, 13);
            sAttrMap.append(R.styleable.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }

        private Loader() {
        }

        public static void read(KeyTrigger keyTrigger, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArray.getIndex(i10);
                switch (sAttrMap.get(index)) {
                    case 1:
                        keyTrigger.mNegativeCross = typedArray.getString(index);
                        break;
                    case 2:
                        keyTrigger.mPositiveCross = typedArray.getString(index);
                        break;
                    case 3:
                    default:
                        Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sAttrMap.get(index));
                        break;
                    case 4:
                        keyTrigger.mCross = typedArray.getString(index);
                        break;
                    case 5:
                        keyTrigger.mTriggerSlack = typedArray.getFloat(index, keyTrigger.mTriggerSlack);
                        break;
                    case 6:
                        keyTrigger.mTriggerID = typedArray.getResourceId(index, keyTrigger.mTriggerID);
                        break;
                    case 7:
                        if (MotionLayout.IS_IN_EDIT_MODE) {
                            int resourceId = typedArray.getResourceId(index, keyTrigger.mTargetId);
                            keyTrigger.mTargetId = resourceId;
                            if (resourceId == -1) {
                                keyTrigger.mTargetString = typedArray.getString(index);
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            keyTrigger.mTargetString = typedArray.getString(index);
                        } else {
                            keyTrigger.mTargetId = typedArray.getResourceId(index, keyTrigger.mTargetId);
                        }
                        break;
                    case 8:
                        int integer = typedArray.getInteger(index, keyTrigger.mFramePosition);
                        keyTrigger.mFramePosition = integer;
                        keyTrigger.mFireThreshold = (integer + 0.5f) / 100.0f;
                        break;
                    case 9:
                        keyTrigger.mTriggerCollisionId = typedArray.getResourceId(index, keyTrigger.mTriggerCollisionId);
                        break;
                    case 10:
                        keyTrigger.mPostLayout = typedArray.getBoolean(index, keyTrigger.mPostLayout);
                        break;
                    case 11:
                        keyTrigger.mTriggerReceiver = typedArray.getResourceId(index, keyTrigger.mTriggerReceiver);
                        break;
                    case 12:
                        keyTrigger.mViewTransitionOnCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnCross);
                        break;
                    case 13:
                        keyTrigger.mViewTransitionOnNegativeCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnNegativeCross);
                        break;
                    case 14:
                        keyTrigger.mViewTransitionOnPositiveCross = typedArray.getResourceId(index, keyTrigger.mViewTransitionOnPositiveCross);
                        break;
                }
            }
        }
    }

    public KeyTrigger() {
        int i10 = Key.UNSET;
        this.mViewTransitionOnNegativeCross = i10;
        this.mViewTransitionOnPositiveCross = i10;
        this.mViewTransitionOnCross = i10;
        this.mCollisionRect = new RectF();
        this.mTargetRect = new RectF();
        this.mMethodHashMap = new HashMap<>();
        this.mCurveFit = -1;
        this.mCross = null;
        int i11 = Key.UNSET;
        this.mTriggerReceiver = i11;
        this.mNegativeCross = null;
        this.mPositiveCross = null;
        this.mTriggerID = i11;
        this.mTriggerCollisionId = i11;
        this.mTriggerCollisionView = null;
        this.mFireCrossReset = true;
        this.mFireNegativeReset = true;
        this.mFirePositiveReset = true;
        this.mFireThreshold = Float.NaN;
        this.mPostLayout = false;
        this.mType = 5;
        this.mCustomConstraints = new HashMap<>();
    }

    private void fire(String str, View view) {
        Method method;
        if (str == null) {
            return;
        }
        if (str.startsWith(".")) {
            fireCustom(str, view);
            return;
        }
        if (this.mMethodHashMap.containsKey(str)) {
            method = this.mMethodHashMap.get(str);
            if (method == null) {
                return;
            }
        } else {
            method = null;
        }
        if (method == null) {
            try {
                method = view.getClass().getMethod(str, null);
                this.mMethodHashMap.put(str, method);
            } catch (NoSuchMethodException unused) {
                this.mMethodHashMap.put(str, null);
                Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
                return;
            }
        }
        try {
            method.invoke(view, null);
        } catch (Exception unused2) {
            Log.e("KeyTrigger", "Exception in call \"" + this.mCross + "\"on class " + view.getClass().getSimpleName() + " " + Debug.getName(view));
        }
    }

    private void fireCustom(String str, View view) {
        boolean z10 = str.length() == 1;
        if (!z10) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.mCustomConstraints.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z10 || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.mCustomConstraints.get(str2);
                if (constraintAttribute != null) {
                    constraintAttribute.applyCustom(view);
                }
            }
        }
    }

    private void setUpRect(RectF rectF, View view, boolean z10) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z10) {
            view.getMatrix().mapRect(rectF);
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void addValues(HashMap<String, ViewSpline> map) {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void conditionallyFire(float r10, android.view.View r11) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyTrigger.conditionallyFire(float, android.view.View):void");
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public Key copy(Key key) {
        super.copy(key);
        KeyTrigger keyTrigger = (KeyTrigger) key;
        this.mCurveFit = keyTrigger.mCurveFit;
        this.mCross = keyTrigger.mCross;
        this.mTriggerReceiver = keyTrigger.mTriggerReceiver;
        this.mNegativeCross = keyTrigger.mNegativeCross;
        this.mPositiveCross = keyTrigger.mPositiveCross;
        this.mTriggerID = keyTrigger.mTriggerID;
        this.mTriggerCollisionId = keyTrigger.mTriggerCollisionId;
        this.mTriggerCollisionView = keyTrigger.mTriggerCollisionView;
        this.mTriggerSlack = keyTrigger.mTriggerSlack;
        this.mFireCrossReset = keyTrigger.mFireCrossReset;
        this.mFireNegativeReset = keyTrigger.mFireNegativeReset;
        this.mFirePositiveReset = keyTrigger.mFirePositiveReset;
        this.mFireThreshold = keyTrigger.mFireThreshold;
        this.mFireLastPos = keyTrigger.mFireLastPos;
        this.mPostLayout = keyTrigger.mPostLayout;
        this.mCollisionRect = keyTrigger.mCollisionRect;
        this.mTargetRect = keyTrigger.mTargetRect;
        this.mMethodHashMap = keyTrigger.mMethodHashMap;
        return this;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void getAttributeNames(HashSet<String> hashSet) {
    }

    int getCurveFit() {
        return this.mCurveFit;
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    public void load(Context context, AttributeSet attributeSet) {
        Loader.read(this, context.obtainStyledAttributes(attributeSet, R.styleable.KeyTrigger), context);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // androidx.constraintlayout.motion.widget.Key
    public void setValue(String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    b10 = 0;
                }
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    b10 = 1;
                }
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    b10 = 2;
                }
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    b10 = 3;
                }
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    b10 = 4;
                }
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    b10 = 5;
                }
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    b10 = 6;
                }
                break;
            case 64397344:
                if (str.equals("CROSS")) {
                    b10 = 7;
                }
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    b10 = 8;
                }
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    b10 = 9;
                }
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    b10 = 10;
                }
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    b10 = Ascii.VT;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.mPositiveCross = obj.toString();
                break;
            case 1:
                this.mViewTransitionOnPositiveCross = toInt(obj);
                break;
            case 2:
                this.mTriggerCollisionId = toInt(obj);
                break;
            case 3:
                this.mTriggerID = toInt(obj);
                break;
            case 4:
                this.mNegativeCross = obj.toString();
                break;
            case 5:
                this.mTriggerCollisionView = (View) obj;
                break;
            case 6:
                this.mViewTransitionOnNegativeCross = toInt(obj);
                break;
            case 7:
                this.mCross = obj.toString();
                break;
            case 8:
                this.mTriggerSlack = toFloat(obj);
                break;
            case 9:
                this.mViewTransitionOnCross = toInt(obj);
                break;
            case 10:
                this.mPostLayout = toBoolean(obj);
                break;
            case 11:
                this.mTriggerReceiver = toInt(obj);
                break;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.Key
    /* JADX INFO: renamed from: clone */
    public Key mo4198clone() {
        return new KeyTrigger().copy(this);
    }
}
