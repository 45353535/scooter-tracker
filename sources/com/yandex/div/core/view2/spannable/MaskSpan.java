package com.yandex.div.core.view2.spannable;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.util.DisplayMetrics;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.MaskData;
import com.yandex.div.internal.spannable.PositionAwareReplacementSpan;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kotlin.Metadata;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u00012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J2\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016JP\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\nH\u0016J0\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010(\u001a\u00020)H\u0002J\r\u0010*\u001a\u00020\bH\u0000¢\u0006\u0002\b+J\u0015\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020\fH\u0000¢\u0006\u0002\b.J(\u0010/\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\f2\u0006\u00101\u001a\u00020)H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskSpan;", "Lcom/yandex/div/internal/spannable/PositionAwareReplacementSpan;", "mask", "Lcom/yandex/div/core/view2/spannable/MaskData;", "hostView", "Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;", "(Lcom/yandex/div/core/view2/spannable/MaskData;Lcom/yandex/div/core/view2/divs/widgets/DivLineHeightTextView;)V", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "fillPaint", "Landroid/graphics/Paint;", "lastHeight", "", "lastWidth", "particles", "", "Lcom/yandex/div/core/view2/spannable/MaskSpan$Particle;", "randomSeed", "", "adjustSize", "", "paint", "text", "", "start", "end", "fm", "Landroid/graphics/Paint$FontMetricsInt;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "x", "top", "y", "bottom", "textPaint", "initParticles", POBCoreNativeConstants.NATIVE_IMAGE_WIDTH, "h", "particlesData", "Lcom/yandex/div/core/view2/spannable/MaskData$Particles;", "isAlive", "isAlive$div_release", "onFrame", "dt", "onFrame$div_release", "reinitParticle", "p", "cfg", "Particle", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MaskSpan extends PositionAwareReplacementSpan {
    private boolean active;

    @NotNull
    private final Paint fillPaint;

    @Nullable
    private final DivLineHeightTextView hostView;
    private float lastHeight;
    private float lastWidth;

    @NotNull
    private final MaskData mask;

    @NotNull
    private final List<Particle> particles = new ArrayList();
    private long randomSeed;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0082\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u0004\b#\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001b¨\u0006*"}, d2 = {"Lcom/yandex/div/core/view2/spannable/MaskSpan$Particle;", "", "", "cx", "cy", "radius", "vx", "vy", "angularVel", "lifetimeMs", "ageMs", "<init>", "(FFFFFFFF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getCx", "()F", "setCx", "(F)V", "getCy", "setCy", "getRadius", "setRadius", "getVx", "setVx", "getVy", "setVy", "getAngularVel", "setAngularVel", "getLifetimeMs", "setLifetimeMs", "getAgeMs", "setAgeMs", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final /* data */ class Particle {
        private float ageMs;
        private float angularVel;
        private float cx;
        private float cy;
        private float lifetimeMs;
        private float radius;
        private float vx;
        private float vy;

        public Particle(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
            this.cx = f10;
            this.cy = f11;
            this.radius = f12;
            this.vx = f13;
            this.vy = f14;
            this.angularVel = f15;
            this.lifetimeMs = f16;
            this.ageMs = f17;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Particle)) {
                return false;
            }
            Particle particle = (Particle) other;
            return Float.compare(this.cx, particle.cx) == 0 && Float.compare(this.cy, particle.cy) == 0 && Float.compare(this.radius, particle.radius) == 0 && Float.compare(this.vx, particle.vx) == 0 && Float.compare(this.vy, particle.vy) == 0 && Float.compare(this.angularVel, particle.angularVel) == 0 && Float.compare(this.lifetimeMs, particle.lifetimeMs) == 0 && Float.compare(this.ageMs, particle.ageMs) == 0;
        }

        public final float getAgeMs() {
            return this.ageMs;
        }

        public final float getAngularVel() {
            return this.angularVel;
        }

        public final float getCx() {
            return this.cx;
        }

        public final float getCy() {
            return this.cy;
        }

        public final float getLifetimeMs() {
            return this.lifetimeMs;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final float getVx() {
            return this.vx;
        }

        public final float getVy() {
            return this.vy;
        }

        public int hashCode() {
            return (((((((((((((Float.floatToIntBits(this.cx) * 31) + Float.floatToIntBits(this.cy)) * 31) + Float.floatToIntBits(this.radius)) * 31) + Float.floatToIntBits(this.vx)) * 31) + Float.floatToIntBits(this.vy)) * 31) + Float.floatToIntBits(this.angularVel)) * 31) + Float.floatToIntBits(this.lifetimeMs)) * 31) + Float.floatToIntBits(this.ageMs);
        }

        public final void setAgeMs(float f10) {
            this.ageMs = f10;
        }

        public final void setAngularVel(float f10) {
            this.angularVel = f10;
        }

        public final void setCx(float f10) {
            this.cx = f10;
        }

        public final void setCy(float f10) {
            this.cy = f10;
        }

        public final void setLifetimeMs(float f10) {
            this.lifetimeMs = f10;
        }

        public final void setRadius(float f10) {
            this.radius = f10;
        }

        public final void setVx(float f10) {
            this.vx = f10;
        }

        public final void setVy(float f10) {
            this.vy = f10;
        }

        @NotNull
        public String toString() {
            return "Particle(cx=" + this.cx + ", cy=" + this.cy + ", radius=" + this.radius + ", vx=" + this.vx + ", vy=" + this.vy + ", angularVel=" + this.angularVel + ", lifetimeMs=" + this.lifetimeMs + ", ageMs=" + this.ageMs + ')';
        }
    }

    public MaskSpan(@NotNull MaskData maskData, @Nullable DivLineHeightTextView divLineHeightTextView) {
        this.mask = maskData;
        this.hostView = divLineHeightTextView;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.fillPaint = paint;
        this.lastWidth = -1.0f;
        this.lastHeight = -1.0f;
    }

    private final void initParticles(float w10, float h10, int start, int end, MaskData.Particles particlesData) {
        Resources resources;
        DisplayMetrics displayMetrics;
        this.lastWidth = w10;
        this.lastHeight = h10;
        this.particles.clear();
        this.randomSeed = ((((long) start) * 73856093) ^ (((long) end) * 19349663)) ^ ((long) a.d(particlesData.getDensity() * 1000.0f));
        Random random = new Random(this.randomSeed);
        float f10 = 1.0f;
        float fMax = Math.max(1.0f, particlesData.getParticleSize());
        double d10 = 3;
        float f11 = 0.7f;
        float fPow = ((float) Math.pow(fMax, 2)) * 3.1415927f * ((((float) Math.pow(1.5f, d10)) - ((float) Math.pow(0.7f, d10))) / 2.4f);
        float density = 0.0f;
        float f12 = fPow > 0.0f ? (w10 * h10) / fPow : 0.0f;
        if (particlesData.getDensity() >= 1.0f) {
            density = 0.99f;
        } else if (particlesData.getDensity() > 0.0f) {
            density = particlesData.getDensity();
        }
        int iN = g.n(a.d(f12 * density), 1, 800);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f10 = displayMetrics.density;
        }
        float f13 = 2.0f * f10;
        float f14 = (f10 * 9.0f) - f13;
        int i10 = 0;
        while (i10 < iN) {
            float fNextFloat = fMax * ((random.nextFloat() * 0.8f) + f11);
            float fNextFloat2 = ((float) (((double) random.nextFloat()) * 6.283185307179586d)) - 3.1415927f;
            float fNextFloat3 = (random.nextFloat() * f14) + f13;
            double d11 = fNextFloat2;
            float fCos = ((float) Math.cos(d11)) * fNextFloat3;
            float fSin = ((float) Math.sin(d11)) * fNextFloat3;
            float fNextFloat4 = (random.nextFloat() - 0.5f) * 0.5f;
            float fNextFloat5 = (random.nextFloat() * 6000.0f) + 6000.0f;
            this.particles.add(new Particle(random.nextFloat() * w10, random.nextFloat() * h10, fNextFloat, fCos, fSin, fNextFloat4, fNextFloat5, random.nextFloat() * fNextFloat5 * 0.5f));
            i10++;
            f13 = f13;
            f11 = 0.7f;
        }
    }

    private final void reinitParticle(Particle p10, float w10, float h10, MaskData.Particles cfg) {
        Resources resources;
        DisplayMetrics displayMetrics;
        Random random = new Random(this.randomSeed + ((long) p10.hashCode()));
        float f10 = 1.0f;
        p10.setRadius(Math.max(1.0f, cfg.getParticleSize()) * ((random.nextFloat() * 0.8f) + 0.7f));
        p10.setCx(random.nextFloat() * w10);
        p10.setCy(random.nextFloat() * h10);
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        if (divLineHeightTextView != null && (resources = divLineHeightTextView.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f10 = displayMetrics.density;
        }
        float f11 = 2.0f * f10;
        float fNextFloat = ((float) (((double) random.nextFloat()) * 6.283185307179586d)) - 3.1415927f;
        float fNextFloat2 = f11 + (random.nextFloat() * ((f10 * 9.0f) - f11));
        double d10 = fNextFloat;
        p10.setVx(((float) Math.cos(d10)) * fNextFloat2);
        p10.setVy(((float) Math.sin(d10)) * fNextFloat2);
        p10.setAngularVel((random.nextFloat() - 0.5f) * 0.5f);
        p10.setLifetimeMs((random.nextFloat() * 6000.0f) + 6000.0f);
        p10.setAgeMs(0.0f);
    }

    @Override // com.yandex.div.internal.spannable.PositionAwareReplacementSpan
    public int adjustSize(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @Nullable Paint.FontMetricsInt fm) {
        return (int) paint.measureText(text, start, end);
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@NotNull Canvas canvas, @NotNull CharSequence text, int start, int end, float x10, int top, int y10, int bottom, @NotNull Paint textPaint) {
        float f10;
        float f11;
        ParticlesTicker particlesTicker$div_release;
        ParticlesTicker particlesTicker$div_release2;
        float fMeasureText = textPaint.measureText(text, start, end);
        float f12 = bottom - top;
        MaskData maskData = this.mask;
        if (maskData instanceof MaskData.Solid) {
            this.fillPaint.setColor(((MaskData.Solid) maskData).getColor());
            canvas.drawRect(x10, top, x10 + fMeasureText, bottom, this.fillPaint);
            this.active = false;
            return;
        }
        if (maskData instanceof MaskData.Particles) {
            if (fMeasureText == this.lastWidth && f12 == this.lastHeight && !this.particles.isEmpty()) {
                f10 = fMeasureText;
                f11 = f12;
            } else {
                f10 = fMeasureText;
                f11 = f12;
                initParticles(f10, f11, start, end, (MaskData.Particles) maskData);
            }
            MaskData.Particles particles = (MaskData.Particles) maskData;
            this.fillPaint.setColor(particles.getColor());
            for (Particle particle : this.particles) {
                canvas.drawCircle(x10 + g.m(particle.getCx(), particle.getRadius(), f10 - particle.getRadius()), top + g.m(particle.getCy(), particle.getRadius(), f11 - particle.getRadius()), particle.getRadius(), this.fillPaint);
            }
            if (particles.getIsAnimated()) {
                this.active = true;
                DivLineHeightTextView divLineHeightTextView = this.hostView;
                if (divLineHeightTextView == null || (particlesTicker$div_release = divLineHeightTextView.getParticlesTicker$div_release()) == null) {
                    return;
                }
                particlesTicker$div_release.track(this);
                return;
            }
            this.active = false;
            DivLineHeightTextView divLineHeightTextView2 = this.hostView;
            if (divLineHeightTextView2 == null || (particlesTicker$div_release2 = divLineHeightTextView2.getParticlesTicker$div_release()) == null) {
                return;
            }
            particlesTicker$div_release2.untrack(this);
        }
    }

    public final boolean isAlive$div_release() {
        DivLineHeightTextView divLineHeightTextView = this.hostView;
        CharSequence text = divLineHeightTextView != null ? divLineHeightTextView.getText() : null;
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        return (spanned == null || spanned.getSpanStart(this) == -1) ? false : true;
    }

    public final boolean onFrame$div_release(float dt) {
        MaskData maskData = this.mask;
        MaskData.Particles particles = maskData instanceof MaskData.Particles ? (MaskData.Particles) maskData : null;
        if (particles == null || !this.active || !particles.getIsEnabled() || !particles.getIsAnimated()) {
            return false;
        }
        if (dt <= 0.0f) {
            return true;
        }
        float f10 = this.lastWidth;
        float f11 = this.lastHeight;
        for (Particle particle : this.particles) {
            float angularVel = particle.getAngularVel() * dt;
            if (angularVel != 0.0f) {
                double d10 = angularVel;
                float fCos = (float) Math.cos(d10);
                float fSin = (float) Math.sin(d10);
                float vx = (particle.getVx() * fCos) - (particle.getVy() * fSin);
                float vx2 = (particle.getVx() * fSin) + (particle.getVy() * fCos);
                particle.setVx(vx);
                particle.setVy(vx2);
            }
            particle.setCx(particle.getCx() + (particle.getVx() * dt));
            particle.setCy(particle.getCy() + (particle.getVy() * dt));
            float radius = particle.getRadius();
            float f12 = -radius;
            if (particle.getCx() < f12) {
                particle.setCx(particle.getCx() + (radius * 2.0f) + f10);
            }
            if (particle.getCx() > f10 + radius) {
                particle.setCx(particle.getCx() - ((radius * 2.0f) + f10));
            }
            if (particle.getCy() < f12) {
                particle.setCy(particle.getCy() + (radius * 2.0f) + f11);
            }
            if (particle.getCy() > f11 + radius) {
                particle.setCy(particle.getCy() - ((radius * 2.0f) + f11));
            }
            particle.setAgeMs(particle.getAgeMs() + (1000.0f * dt));
            if (particle.getAgeMs() >= particle.getLifetimeMs()) {
                reinitParticle(particle, f10, f11, particles);
            }
        }
        return true;
    }
}
