package com.infostretch;

public class Flow implements IFlowTest{
    private IObjectVal  _IOV;
    private IRangeVal _IRV;
    private IGetFizzBuzz _IGFB;
    public Flow(IObjectVal IOV, IRangeVal IRV, IGetFizzBuzz IGFB){
        this._IOV = IOV;
        this._IRV = IRV;
        this._IGFB = IGFB;
    }

    public boolean getResult(String s){
        boolean convertStringCheck = this._IOV.isInteger(s);
        if(convertStringCheck) {
        	 boolean rangeCheck = this._IRV.getResult(Integer.parseInt(s));
             if (rangeCheck) {
                 this._IGFB.getResult(Integer.parseInt(s));
             }
        } else {
        	return false;
        }
        return true;
    }
}