package uz.ramz.calc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uz.ramz.calc.service.CalcService;

@RestController
public class MyRestController {

    private final CalcService service;

    public MyRestController(CalcService service) {
        this.service = service;
    }

    @GetMapping("calc1")
    public double calc1(@RequestParam double aaa, @RequestParam double bbb, @RequestParam double ccc,
                        @RequestParam double ddd,@RequestParam double eee,@RequestParam double fff,
                        @RequestParam double ggg) {
        return service.calc1(aaa,bbb,ccc,ddd,eee,fff,ggg);
    }

    @GetMapping("calc2")
    public double calc2(@RequestParam double a2, @RequestParam double b2) {
        return service.calc2(a2,b2);
    }

    @GetMapping("calc22")
    public double calc22(@RequestParam double c2, @RequestParam double d2) {
       return service.calc22(c2,d2);
    }

    @GetMapping("calc3")
    public double calc3(@RequestParam double aaa, @RequestParam double bbb,
                        @RequestParam double ccc,@RequestParam double ddd,
                        @RequestParam double eee,@RequestParam double fff) {
        return service.calc3(aaa,bbb,ccc,ddd,eee,fff);
    }

    @GetMapping("calc4")
    public double calc4(@RequestParam double aaa, @RequestParam double bbb,
                        @RequestParam double ccc,@RequestParam double ddd,
                        @RequestParam double eee) {
        return service.calc4(aaa,bbb,ccc,ddd,eee);
    }

    @GetMapping("calc5")
    public double calc5(@RequestParam double aaa, @RequestParam double bbb,
                        @RequestParam double ccc,@RequestParam double ddd,
                        @RequestParam double eee,@RequestParam double fff,
                        @RequestParam double ggg) {
        return service.calc5(aaa,bbb,ccc,ddd,eee,fff,ggg);
    }

    @GetMapping("calc6")
    public double calc6(@RequestParam double aaa, @RequestParam double bbb,
                        @RequestParam double ccc,@RequestParam double ddd,
                        @RequestParam double ggg,@RequestParam double eee) {
        return service.calc6(aaa, bbb,ccc,ddd,ggg,eee);
    }

    @GetMapping("calc7")
    public double calc7(@RequestParam double aaa, @RequestParam double bbb,
                        @RequestParam double ccc,@RequestParam double ddd,
                        @RequestParam double eee,@RequestParam double fff,@RequestParam double ggg,
                        @RequestParam double hhh,@RequestParam double iii,@RequestParam double jjj,@RequestParam double kkk) {
        return service.calc7(aaa,bbb,ccc,ddd,eee,fff,ggg,hhh,iii,jjj,kkk);
    }

    @GetMapping("calc77")
    public double calc77(@RequestParam double aaa, @RequestParam double bbb,
                        @RequestParam double ccc,@RequestParam double ddd,
                        @RequestParam double eee,@RequestParam double fff,@RequestParam double ggg,
                        @RequestParam double hhh,@RequestParam double iii,@RequestParam double jjj,@RequestParam double kkk) {
        return service.calc77(aaa,bbb,ccc,ddd,eee,fff,ggg,hhh,iii,jjj,kkk);


    }


}
