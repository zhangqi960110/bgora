package com.pcassem.www.huaweithyj.work.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.FaultEntity;

import java.util.List;

public class FaultListAdapter extends RecyclerView.Adapter<FaultListAdapter.ViewHolder> implements View.OnClickListener {


    private Context mContext;
    private List<FaultEntity.ListDataBean> mData;


    public FaultListAdapter(Context context, List<FaultEntity.ListDataBean> data) {
        this.mContext = context;
        this.mData = data;
    }

    public void setmData(List<FaultEntity.ListDataBean> data){
        this.mData = data;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FaultListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_fault, parent, false);

        view.setOnClickListener(this);
        return new FaultListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FaultListAdapter.ViewHolder holder, final int position) {

        holder.time.setText(mData.get(position).getTime());
        if (mData.get(position).getService_type().equals("巡检服务")){
            holder.lable1.setVisibility(View.VISIBLE);
            holder.lable2.setVisibility(View.GONE);
        }else {
            holder.lable1.setVisibility(View.GONE);
            holder.lable2.setVisibility(View.VISIBLE);
        }
        holder.code.setText(mData.get(position).getCode());

        holder.itemView.setTag(position);

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public void setmOnItemClickListener(FaultListAdapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    private FaultListAdapter.OnItemClickListener mOnItemClickListener = null;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(v, (Integer) v.getTag());
        }
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView time;
        private TextView lable1;
        private TextView lable2;
        private TextView code;


        public ViewHolder(View itemView) {
            super(itemView);
            time = itemView.findViewById(R.id.time);
            lable1 = itemView.findViewById(R.id.lable1);
            lable2 = itemView.findViewById(R.id.lable2);
            code = itemView.findViewById(R.id.code);
        }
    }
}
