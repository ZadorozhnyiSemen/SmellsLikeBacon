package reksoft.zadorozhnyi.smellslikebacon;

public class GridAdapter  extends RecyclerAdapter{
    private final GridFragment.OnRecipeSelectedInterface mListener;

    public GridAdapter(GridFragment.OnRecipeSelectedInterface listener) {
        mListener = listener;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.grid_item;
    }

    @Override
    protected void onListRecipeSelected(int index) {
        mListener.onGridRecipeSelected(index);
    }
}