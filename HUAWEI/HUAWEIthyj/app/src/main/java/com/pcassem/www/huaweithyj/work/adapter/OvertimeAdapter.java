package com.pcassem.www.huaweithyj.work.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pcassem.www.huaweithyj.R;
import com.pcassem.www.huaweithyj.entity.SigninEntity;

import java.util.List;

public class OvertimeAdapter extends RecyclerView.Adapter<OvertimeAdapter.ViewHolder> implements View.OnClickListener {


    private Context mContext;
    private List<SigninEntity.ListDataBean> mData;


    public OvertimeAdapter(Context context, List<SigninEntity.ListDataBean> data) {
        this.mContext = context;
        this.mData = data;
    }

    public void setmData(List<SigninEntity.ListDataBean> data){
        this.mData = data;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public OvertimeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_sign_in, parent, false);

        view.setOnClickListener(this);
        return new OvertimeAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OvertimeAdapter.ViewHolder holder, final int position) {

        holder.position.setText(mData.get(position).getPosition());
        holder.timestart.setText("签到:"+mData.get(position).getTimestart());
        holder.timeend.setText("签退:"+mData.get(position).getTimeend());
        holder.itemView.setTag(mData.get(position).getRid());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    public void setmOnItemClickListener(OvertimeAdapter.OnItemClickListener mOnItemClickListener) {
        this.mOnItemClickListener = mOnItemClickListener;
    }

    private OvertimeAdapter.OnItemClickListener mOnItemClickListener = null;

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

        private TextView position;
        private TextView timestart;
        private TextView timeend;

        public ViewHolder(View itemView) {
            super(itemView);
            position = itemView.findViewById(R.id.position);
            timestart = itemView.findViewById(R.id.timestart);
            timeend = itemView.findViewById(R.id.timeend);
        }
    }
}
