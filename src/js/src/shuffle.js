

Array.prototype.shuffle = function() {
    var i = this.length,
        j,
        temp;

    while(--i > 0) {
        j = Math.floor(Math.random() * (i + 1));
        temp = this[j];
        this[j] = this[i];
        this[i] = temp;
    }
    return this;
}

var arr = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13];


var result = arr.shuffle();
document.getElementById("displayArr").innerHTML = result;
