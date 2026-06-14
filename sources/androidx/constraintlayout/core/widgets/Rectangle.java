package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4447y;

    public boolean contains(int i10, int i11) {
        int i12;
        int i13 = this.f4446x;
        return i10 >= i13 && i10 < i13 + this.width && i11 >= (i12 = this.f4447y) && i11 < i12 + this.height;
    }

    public int getCenterX() {
        return (this.f4446x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f4447y + this.height) / 2;
    }

    void grow(int i10, int i11) {
        this.f4446x -= i10;
        this.f4447y -= i11;
        this.width += i10 * 2;
        this.height += i11 * 2;
    }

    boolean intersects(Rectangle rectangle) {
        int i10;
        int i11;
        int i12 = this.f4446x;
        int i13 = rectangle.f4446x;
        return i12 >= i13 && i12 < i13 + rectangle.width && (i10 = this.f4447y) >= (i11 = rectangle.f4447y) && i10 < i11 + rectangle.height;
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        this.f4446x = i10;
        this.f4447y = i11;
        this.width = i12;
        this.height = i13;
    }
}
