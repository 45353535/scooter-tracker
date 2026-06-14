package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class KeyFrames {
    private static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    private static final String CUSTOM_METHOD = "CustomMethod";
    private static final String TAG = "KeyFrames";
    public static final int UNSET = -1;
    static HashMap<String, Constructor<? extends Key>> sKeyMakers;
    private HashMap<Integer, ArrayList<Key>> mFramesMap = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends Key>> map = new HashMap<>();
        sKeyMakers = map;
        try {
            map.put("KeyAttribute", KeyAttributes.class.getConstructor(null));
            sKeyMakers.put("KeyPosition", KeyPosition.class.getConstructor(null));
            sKeyMakers.put("KeyCycle", KeyCycle.class.getConstructor(null));
            sKeyMakers.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(null));
            sKeyMakers.put("KeyTrigger", KeyTrigger.class.getConstructor(null));
        } catch (NoSuchMethodException e10) {
            Log.e(TAG, "unable to load", e10);
        }
    }

    public KeyFrames() {
    }

    static String name(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10);
    }

    public void addAllFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(-1);
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
    }

    public void addFrames(MotionController motionController) {
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(motionController.mId));
        if (arrayList != null) {
            motionController.addKeys(arrayList);
        }
        ArrayList<Key> arrayList2 = this.mFramesMap.get(-1);
        if (arrayList2 != null) {
            for (Key key : arrayList2) {
                if (key.matches(((ConstraintLayout.LayoutParams) motionController.mView.getLayoutParams()).constraintTag)) {
                    motionController.addKey(key);
                }
            }
        }
    }

    public void addKey(Key key) {
        if (!this.mFramesMap.containsKey(Integer.valueOf(key.mTargetId))) {
            this.mFramesMap.put(Integer.valueOf(key.mTargetId), new ArrayList<>());
        }
        ArrayList<Key> arrayList = this.mFramesMap.get(Integer.valueOf(key.mTargetId));
        if (arrayList != null) {
            arrayList.add(key);
        }
    }

    public ArrayList<Key> getKeyFramesForView(int i10) {
        return this.mFramesMap.get(Integer.valueOf(i10));
    }

    public Set<Integer> getKeys() {
        return this.mFramesMap.keySet();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public KeyFrames(android.content.Context r9, org.xmlpull.v1.XmlPullParser r10) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.KeyFrames.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
