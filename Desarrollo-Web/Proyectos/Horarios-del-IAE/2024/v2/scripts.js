var newBackground = document.getElementById('background-selector');
var bg = document.body;

newBackground.addEventListener('input', function() {
    bg.style.backgroundColor = newBackground.value;
});

var resetBackground = document.getElementById('reset-bg');
resetBackground.addEventListener('click', function() {
    bg.style.backgroundColor = '';
});