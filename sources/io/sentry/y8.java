package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class y8 implements Collection, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f84498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final io.sentry.util.a f84499c;

    y8(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("Collection must not be null.");
        }
        this.f84498b = collection;
        this.f84499c = new io.sentry.util.a();
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zAdd = g().add(obj);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zAdd;
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
    public boolean addAll(Collection collection) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zAddAll = g().addAll(collection);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zAddAll;
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
    public void clear() {
        g1 g1VarD = this.f84499c.d();
        try {
            g().clear();
            if (g1VarD != null) {
                g1VarD.close();
            }
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
    public boolean contains(Object obj) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zContains = g().contains(obj);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zContains;
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
    public boolean containsAll(Collection collection) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zContainsAll = g().containsAll(collection);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zContainsAll;
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

    protected Collection g() {
        return this.f84498b;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zIsEmpty = g().isEmpty();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zIsEmpty;
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

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return g().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zRemove = g().remove(obj);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zRemove;
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
    public boolean removeAll(Collection collection) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zRemoveAll = g().removeAll(collection);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zRemoveAll;
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
    public boolean retainAll(Collection collection) {
        g1 g1VarD = this.f84499c.d();
        try {
            boolean zRetainAll = g().retainAll(collection);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zRetainAll;
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
    public int size() {
        g1 g1VarD = this.f84499c.d();
        try {
            int size = g().size();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return size;
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

    public String toString() {
        g1 g1VarD = this.f84499c.d();
        try {
            String string = g().toString();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return string;
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
