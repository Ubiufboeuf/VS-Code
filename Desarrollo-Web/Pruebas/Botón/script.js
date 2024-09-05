document.querySelector('.ripple-button').addEventListener('mousedown', function (e) {
  const ripple = document.createElement('span');
  ripple.className = 'ripple';
  this.appendChild(ripple);

  const diameter = Math.max(this.clientWidth, this.clientHeight);
  const radius = diameter / 2;
  ripple.style.width = ripple.style.height = `${diameter}px`;
  ripple.style.left = `${e.clientX - this.offsetLeft - radius}px`;
  ripple.style.top = `${e.clientY - this.offsetTop - radius}px`;

  ripple.addEventListener('animationend', () => {
      ripple.remove();
  });
});