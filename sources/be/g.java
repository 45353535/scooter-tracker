package be;

/* JADX INFO: loaded from: classes3.dex */
public class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f6402a = new a();

    @Override // be.c
    public /* synthetic */ Double a(Object obj) {
        return b.c(this, obj);
    }

    @Override // be.c
    public /* synthetic */ Integer b(Object obj) {
        return b.g(this, obj);
    }

    @Override // be.c
    public /* synthetic */ float c(Object obj, float f10) {
        return b.d(this, obj, f10);
    }

    @Override // be.c
    public /* synthetic */ Float d(Object obj) {
        return b.e(this, obj);
    }

    @Override // be.c
    public /* synthetic */ String e(Object obj) {
        return b.h(this, obj);
    }

    @Override // be.c
    public String f(Object obj, String str) {
        if (obj == null) {
            return str;
        }
        String strE = this.f6402a.e(obj);
        if (strE != null) {
            return strE;
        }
        try {
            return String.valueOf(obj);
        } catch (Exception e10) {
            io.bidmachine.core.a.p(e10);
            return str;
        }
    }

    @Override // be.c
    public /* synthetic */ boolean g(Object obj, boolean z10) {
        return b.a(this, obj, z10);
    }

    @Override // be.c
    public Boolean h(Object obj, Boolean bool) {
        if (obj != null) {
            Boolean boolI = this.f6402a.i(obj);
            if (boolI != null) {
                return boolI;
            }
            String strE = this.f6402a.e(obj);
            if (strE != null) {
                try {
                    return Boolean.valueOf(strE);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                    return bool;
                }
            }
        }
        return bool;
    }

    @Override // be.c
    public /* synthetic */ Boolean i(Object obj) {
        return b.b(this, obj);
    }

    @Override // be.c
    public /* synthetic */ int j(Object obj, int i10) {
        return b.f(this, obj, i10);
    }

    @Override // be.c
    public Integer k(Object obj, Integer num) {
        if (obj != null) {
            Integer numB = this.f6402a.b(obj);
            if (numB != null) {
                return numB;
            }
            Double dA = this.f6402a.a(obj);
            if (dA != null) {
                return Integer.valueOf(dA.intValue());
            }
            Float fD = this.f6402a.d(obj);
            if (fD != null) {
                return Integer.valueOf(fD.intValue());
            }
            String strE = this.f6402a.e(obj);
            if (strE != null) {
                try {
                    return Integer.valueOf(strE);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                }
            }
        }
        return num;
    }

    @Override // be.c
    public Float l(Object obj, Float f10) {
        if (obj != null) {
            Float fD = this.f6402a.d(obj);
            if (fD != null) {
                return fD;
            }
            Integer numB = this.f6402a.b(obj);
            if (numB != null) {
                return Float.valueOf(numB.floatValue());
            }
            String strE = e(obj);
            if (strE != null) {
                try {
                    return Float.valueOf(strE);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                }
            }
        }
        return f10;
    }

    @Override // be.c
    public Double m(Object obj, Double d10) {
        if (obj != null) {
            Double dA = this.f6402a.a(obj);
            if (dA != null) {
                return dA;
            }
            Integer numB = this.f6402a.b(obj);
            if (numB != null) {
                return Double.valueOf(numB.doubleValue());
            }
            String strE = e(obj);
            if (strE != null) {
                try {
                    return Double.valueOf(strE);
                } catch (Exception e10) {
                    io.bidmachine.core.a.p(e10);
                }
            }
        }
        return d10;
    }
}
