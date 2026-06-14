package androidx.compose.animation.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J0\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001eH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u0004R\u000e\u0010\u000e\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\u0004\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/SpringSimulation;", "", "finalPosition", "", "(F)V", "dampedFreq", "", "value", "dampingRatio", "getDampingRatio", "()F", "setDampingRatio", "getFinalPosition", "setFinalPosition", "gammaMinus", "gammaPlus", "initialized", "", "naturalFreq", "stiffness", "getStiffness", "setStiffness", "getAcceleration", "lastDisplacement", "lastVelocity", "init", "", "updateValues", "Landroidx/compose/animation/core/Motion;", "timeElapsed", "", "updateValues-IJZedt4$animation_core_release", "(FFJ)J", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SpringSimulation {
    private double dampedFreq;
    private float finalPosition;
    private double gammaMinus;
    private double gammaPlus;
    private boolean initialized;
    private double naturalFreq = Math.sqrt(50.0d);
    private float dampingRatio = 1.0f;

    public SpringSimulation(float f10) {
        this.finalPosition = f10;
    }

    private final void init() {
        if (this.initialized) {
            return;
        }
        if (this.finalPosition == SpringSimulationKt.getUNSET()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f10 = this.dampingRatio;
        double d10 = ((double) f10) * ((double) f10);
        if (f10 > 1.0f) {
            double d11 = this.naturalFreq;
            double d12 = d10 - ((double) 1);
            this.gammaPlus = (((double) (-f10)) * d11) + (d11 * Math.sqrt(d12));
            double d13 = -this.dampingRatio;
            double d14 = this.naturalFreq;
            this.gammaMinus = (d13 * d14) - (d14 * Math.sqrt(d12));
        } else if (f10 >= 0.0f && f10 < 1.0f) {
            this.dampedFreq = this.naturalFreq * Math.sqrt(((double) 1) - d10);
        }
        this.initialized = true;
    }

    public final float getAcceleration(float lastDisplacement, float lastVelocity) {
        float f10 = lastDisplacement - this.finalPosition;
        double d10 = this.naturalFreq;
        return (float) (((-(d10 * d10)) * ((double) f10)) - (((d10 * 2.0d) * ((double) this.dampingRatio)) * ((double) lastVelocity)));
    }

    public final float getDampingRatio() {
        return this.dampingRatio;
    }

    public final float getFinalPosition() {
        return this.finalPosition;
    }

    public final float getStiffness() {
        double d10 = this.naturalFreq;
        return (float) (d10 * d10);
    }

    public final void setDampingRatio(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.dampingRatio = f10;
        this.initialized = false;
    }

    public final void setFinalPosition(float f10) {
        this.finalPosition = f10;
    }

    public final void setStiffness(float f10) {
        if (getStiffness() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.naturalFreq = Math.sqrt(f10);
        this.initialized = false;
    }

    /* JADX INFO: renamed from: updateValues-IJZedt4$animation_core_release, reason: not valid java name */
    public final long m126updateValuesIJZedt4$animation_core_release(float lastDisplacement, float lastVelocity, long timeElapsed) {
        double dCos;
        double dExp;
        init();
        float f10 = lastDisplacement - this.finalPosition;
        double d10 = timeElapsed / 1000.0d;
        float f11 = this.dampingRatio;
        if (f11 > 1.0f) {
            double d11 = f10;
            double d12 = this.gammaMinus;
            double d13 = lastVelocity;
            double d14 = this.gammaPlus;
            double d15 = d11 - (((d12 * d11) - d13) / (d12 - d14));
            double d16 = ((d11 * d12) - d13) / (d12 - d14);
            dExp = (Math.exp(d12 * d10) * d15) + (Math.exp(this.gammaPlus * d10) * d16);
            double d17 = this.gammaMinus;
            double dExp2 = d15 * d17 * Math.exp(d17 * d10);
            double d18 = this.gammaPlus;
            dCos = dExp2 + (d16 * d18 * Math.exp(d18 * d10));
        } else if (f11 == 1.0f) {
            double d19 = this.naturalFreq;
            double d20 = f10;
            double d21 = ((double) lastVelocity) + (d19 * d20);
            double d22 = d20 + (d21 * d10);
            double dExp3 = Math.exp((-d19) * d10) * d22;
            double dExp4 = d22 * Math.exp((-this.naturalFreq) * d10);
            double d23 = this.naturalFreq;
            dCos = (dExp4 * (-d23)) + (d21 * Math.exp((-d23) * d10));
            dExp = dExp3;
        } else {
            double d24 = ((double) 1) / this.dampedFreq;
            double d25 = this.naturalFreq;
            double d26 = f10;
            double d27 = d24 * ((((double) f11) * d25 * d26) + ((double) lastVelocity));
            double dExp5 = Math.exp(((double) (-f11)) * d25 * d10) * ((Math.cos(this.dampedFreq * d10) * d26) + (Math.sin(this.dampedFreq * d10) * d27));
            double d28 = this.naturalFreq;
            float f12 = this.dampingRatio;
            double d29 = (-d28) * dExp5 * ((double) f12);
            double dExp6 = Math.exp(((double) (-f12)) * d28 * d10);
            double d30 = this.dampedFreq;
            double dSin = (-d30) * d26 * Math.sin(d30 * d10);
            double d31 = this.dampedFreq;
            dCos = d29 + (dExp6 * (dSin + (d27 * d31 * Math.cos(d31 * d10))));
            dExp = dExp5;
        }
        return SpringSimulationKt.Motion((float) (dExp + ((double) this.finalPosition)), (float) dCos);
    }
}
