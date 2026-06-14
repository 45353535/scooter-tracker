package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;

/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements Dependency {
    protected ConstraintWidget.DimensionBehaviour mDimensionBehavior;
    RunGroup mRunGroup;
    ConstraintWidget mWidget;
    public int matchConstraintsType;
    DimensionDependency mDimension = new DimensionDependency(this);
    public int orientation = 0;
    boolean mResolved = false;
    public DependencyNode start = new DependencyNode(this);
    public DependencyNode end = new DependencyNode(this);
    protected RunType mRunType = RunType.NONE;

    /* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.analyzer.WidgetRun$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type;

        static {
            int[] iArr = new int[ConstraintAnchor.Type.values().length];
            $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type = iArr;
            try {
                iArr[ConstraintAnchor.Type.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[ConstraintAnchor.Type.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum RunType {
        NONE,
        START,
        END,
        CENTER
    }

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.mWidget = constraintWidget;
    }

    private void resolveDimension(int i10, int i11) {
        int i12 = this.matchConstraintsType;
        if (i12 == 0) {
            this.mDimension.resolve(getLimitedDimension(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.mDimension.resolve(Math.min(getLimitedDimension(this.mDimension.wrapValue, i10), i11));
            return;
        }
        if (i12 == 2) {
            ConstraintWidget parent = this.mWidget.getParent();
            if (parent != null) {
                if ((i10 == 0 ? parent.mHorizontalRun : parent.mVerticalRun).mDimension.resolved) {
                    this.mDimension.resolve(getLimitedDimension((int) ((r9.value * (i10 == 0 ? this.mWidget.mMatchConstraintPercentWidth : this.mWidget.mMatchConstraintPercentHeight)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        ConstraintWidget constraintWidget = this.mWidget;
        WidgetRun widgetRun = constraintWidget.mHorizontalRun;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = widgetRun.mDimensionBehavior;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        if (dimensionBehaviour == dimensionBehaviour2 && widgetRun.matchConstraintsType == 3) {
            VerticalWidgetRun verticalWidgetRun = constraintWidget.mVerticalRun;
            if (verticalWidgetRun.mDimensionBehavior == dimensionBehaviour2 && verticalWidgetRun.matchConstraintsType == 3) {
                return;
            }
        }
        if (i10 == 0) {
            widgetRun = constraintWidget.mVerticalRun;
        }
        if (widgetRun.mDimension.resolved) {
            float dimensionRatio = constraintWidget.getDimensionRatio();
            this.mDimension.resolve(i10 == 1 ? (int) ((widgetRun.mDimension.value / dimensionRatio) + 0.5f) : (int) ((dimensionRatio * widgetRun.mDimension.value) + 0.5f));
        }
    }

    protected final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10) {
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mMargin = i10;
        dependencyNode2.mDependencies.add(dependencyNode);
    }

    abstract void apply();

    abstract void applyToWidget();

    abstract void clear();

    protected final int getLimitedDimension(int i10, int i11) {
        if (i11 == 0) {
            ConstraintWidget constraintWidget = this.mWidget;
            int i12 = constraintWidget.mMatchConstraintMaxWidth;
            int iMax = Math.max(constraintWidget.mMatchConstraintMinWidth, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.mWidget;
            int i13 = constraintWidget2.mMatchConstraintMaxHeight;
            int iMax2 = Math.max(constraintWidget2.mMatchConstraintMinHeight, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final DependencyNode getTarget(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        int i10 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i10 == 1) {
            return constraintWidget.mHorizontalRun.start;
        }
        if (i10 == 2) {
            return constraintWidget.mHorizontalRun.end;
        }
        if (i10 == 3) {
            return constraintWidget.mVerticalRun.start;
        }
        if (i10 == 4) {
            return constraintWidget.mVerticalRun.baseline;
        }
        if (i10 != 5) {
            return null;
        }
        return constraintWidget.mVerticalRun.end;
    }

    public long getWrapDimension() {
        if (this.mDimension.resolved) {
            return r0.value;
        }
        return 0L;
    }

    public boolean isCenterConnection() {
        int size = this.start.mTargets.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (this.start.mTargets.get(i11).mRun != this) {
                i10++;
            }
        }
        int size2 = this.end.mTargets.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (this.end.mTargets.get(i12).mRun != this) {
                i10++;
            }
        }
        return i10 >= 2;
    }

    public boolean isDimensionResolved() {
        return this.mDimension.resolved;
    }

    public boolean isResolved() {
        return this.mResolved;
    }

    abstract void reset();

    abstract boolean supportsWrapComputation();

    @Override // androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(Dependency dependency) {
    }

    protected void updateRunCenter(Dependency dependency, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i10) {
        DependencyNode target = getTarget(constraintAnchor);
        DependencyNode target2 = getTarget(constraintAnchor2);
        if (target.resolved && target2.resolved) {
            int margin = target.value + constraintAnchor.getMargin();
            int margin2 = target2.value - constraintAnchor2.getMargin();
            int i11 = margin2 - margin;
            if (!this.mDimension.resolved && this.mDimensionBehavior == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                resolveDimension(i10, i11);
            }
            DimensionDependency dimensionDependency = this.mDimension;
            if (dimensionDependency.resolved) {
                if (dimensionDependency.value == i11) {
                    this.start.resolve(margin);
                    this.end.resolve(margin2);
                    return;
                }
                float horizontalBiasPercent = i10 == 0 ? this.mWidget.getHorizontalBiasPercent() : this.mWidget.getVerticalBiasPercent();
                if (target == target2) {
                    margin = target.value;
                    margin2 = target2.value;
                    horizontalBiasPercent = 0.5f;
                }
                this.start.resolve((int) (margin + 0.5f + (((margin2 - margin) - this.mDimension.value) * horizontalBiasPercent)));
                this.end.resolve(this.start.value + this.mDimension.value);
            }
        }
    }

    protected void updateRunEnd(Dependency dependency) {
    }

    protected void updateRunStart(Dependency dependency) {
    }

    public long wrapSize(int i10) {
        DimensionDependency dimensionDependency = this.mDimension;
        if (!dimensionDependency.resolved) {
            return 0L;
        }
        long j10 = dimensionDependency.value;
        return isCenterConnection() ? j10 + ((long) (this.start.mMargin - this.end.mMargin)) : i10 == 0 ? j10 + ((long) this.start.mMargin) : j10 - ((long) this.end.mMargin);
    }

    protected final void addTarget(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i10, DimensionDependency dimensionDependency) {
        dependencyNode.mTargets.add(dependencyNode2);
        dependencyNode.mTargets.add(this.mDimension);
        dependencyNode.mMarginFactor = i10;
        dependencyNode.mMarginDependency = dimensionDependency;
        dependencyNode2.mDependencies.add(dependencyNode);
        dimensionDependency.mDependencies.add(dependencyNode);
    }

    protected final DependencyNode getTarget(ConstraintAnchor constraintAnchor, int i10) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.mTarget;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.mOwner;
        WidgetRun widgetRun = i10 == 0 ? constraintWidget.mHorizontalRun : constraintWidget.mVerticalRun;
        int i11 = AnonymousClass1.$SwitchMap$androidx$constraintlayout$core$widgets$ConstraintAnchor$Type[constraintAnchor2.mType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return widgetRun.end;
        }
        return widgetRun.start;
    }
}
