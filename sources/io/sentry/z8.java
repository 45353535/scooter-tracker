package io.sentry;

import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
final class z8 extends y8 implements Queue {
    private z8(Queue queue) {
        super(queue);
    }

    static z8 j(Queue queue) {
        return new z8(queue);
    }

    @Override // java.util.Queue
    public Object element() {
        g1 g1VarD = this.f84499c.d();
        try {
            Object objElement = g().element();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return objElement;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zEquals = g().equals(obj);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zEquals;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public int hashCode() {
        g1 g1VarD = this.f84499c.d();
        try {
            int iHashCode = g().hashCode();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return iHashCode;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.y8
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Queue g() {
        return (Queue) super.g();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zOffer = g().offer(obj);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zOffer;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public Object peek() {
        g1 g1VarD = this.f84499c.d();
        try {
            Object objPeek = g().peek();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return objPeek;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public Object poll() {
        g1 g1VarD = this.f84499c.d();
        try {
            Object objPoll = g().poll();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return objPoll;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Queue
    public Object remove() {
        g1 g1VarD = this.f84499c.d();
        try {
            Object objRemove = g().remove();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return objRemove;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        g1 g1VarD = this.f84499c.d();
        try {
            Object[] array = g().toArray();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return array;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        g1 g1VarD = this.f84499c.d();
        try {
            Object[] array = g().toArray(objArr);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return array;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
