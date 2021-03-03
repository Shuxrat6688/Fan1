package uz.ramz.calc.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{
    @Override
    public double calc1(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg) {
        return (3600 * aaa * bbb * ccc * ddd * eee) / (fff * ggg);
    }

    @Override
    public double calc2(double a2, double b2) {
        return  a2*b2/(a2+b2);
    }

    @Override
    public double calc22(double c2, double d2) {
        return c2*d2/2;
    }

    @Override
    public double calc3(double aaa, double bbb, double ccc, double ddd, double eee, double fff) {
        return (362.85*Math.pow(aaa,6)*Math.pow(bbb,3)*ccc)/(Math.pow(ddd,2)*Math.pow(eee,3)*Math.pow(fff,2));
    }

    @Override
    public double calc4(double aaa, double bbb, double ccc, double ddd, double eee) {
        return (7.26*aaa*bbb*ccc*Math.pow((1-Math.pow(ddd,2)),0.5))/eee;
    }

    @Override
    public double calc5(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg) {
        return (0.125*Math.pow(aaa,2)*bbb)/(ccc*ddd*eee*fff*ggg);
    }

    @Override
    public double calc6(double aaa, double bbb, double ccc, double ddd, double ggg, double eee) {
        return (0.067*aaa*Math.pow(bbb,2)*Math.pow(ccc,2)*ddd)/(Math.pow(ggg,3)*eee);
    }

    @Override
    public double calc7(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg, double hhh, double iii, double jjj, double kkk) {
        return (1580*Math.pow(aaa,4)*Math.pow(bbb,2)*ccc*ddd*eee)/(Math.pow(fff,2)*ggg*hhh*iii*jjj*kkk);
    }

    @Override
    public double calc77(double aaa, double bbb, double ccc, double ddd, double eee, double fff, double ggg, double hhh, double iii, double jjj, double kkk) {
        return (1580*Math.pow(aaa,4)*Math.pow(bbb,2)*ccc*ddd*eee)/(Math.pow(fff,2)*ggg*hhh*iii*jjj*kkk);
    }
}
