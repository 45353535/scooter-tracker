package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* JADX INFO: loaded from: classes.dex */
public abstract class Guideline extends Helper {
    private int mEnd;
    private float mPercent;
    private int mStart;

    Guideline(String str) {
        super(str, new Helper.HelperType(""));
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mPercent = Float.NaN;
    }

    public int getEnd() {
        return this.mEnd;
    }

    public float getPercent() {
        return this.mPercent;
    }

    public int getStart() {
        return this.mStart;
    }

    public void setEnd(int i10) {
        this.mEnd = i10;
        this.configMap.put("end", String.valueOf(i10));
    }

    public void setPercent(float f10) {
        this.mPercent = f10;
        this.configMap.put("percent", String.valueOf(f10));
    }

    public void setStart(int i10) {
        this.mStart = i10;
        this.configMap.put("start", String.valueOf(i10));
    }
}
