function outter() {
    x = 3;
    function inner() {
        console.log("inner", x);
        x = 4;
    }
    inner();
    console.log("outter", x);
}

outter();