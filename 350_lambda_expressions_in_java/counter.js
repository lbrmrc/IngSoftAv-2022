function makeCounter(init){
    return () => {
        init++;
        return init-1;
    }
}

c1 = makeCounter(1);
c2 = makeCounter(1);

console.log(c1());
console.log(c1());
console.log(c2());
console.log(c2());
