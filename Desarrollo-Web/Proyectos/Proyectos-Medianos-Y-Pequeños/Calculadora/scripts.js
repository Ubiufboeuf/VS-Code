const $screen = document.querySelector("h1#screen");
const $buttons = document.querySelectorAll("button");
let prev;

// Evento - - - - - - - - - -

$buttons.forEach((btn) => {
    btn.addEventListener("click", () => {
        buttons(btn, btn.value, $screen, $screen.textContent);
    });
});

// Funciones - - - - - - - - - -

$screen.textContent = "0";

function buttons (btn, val, screen, screenVal) {
  if (btn.value != null) {
    if (val >= 0 && val <= 9) {
      if (screenVal.length <= 40) {
        if (screenVal == 0) {
          $screen.textContent = val;
        } else {
          $screen.textContent += val;
        }
      }
    }
  }
}