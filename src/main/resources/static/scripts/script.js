document.addEventListener("DOMContentLoaded", () => {
	document.querySelector('#radio1').checked = true;
	
	const form = document.forms[0];
	const radioButtons = document.querySelectorAll('input[name="test"]');
	const sizeLabel = document.querySelector('#sizeLabel');
	const sizeInput = document.querySelector('#sizeInput');
	
	radioButtons.forEach((item) => item.addEventListener('change', () => {
		if (item.checked && item.value === 'diagonal') {
			sizeLabel.innerHTML= 'Diagonal:';
			sizeInput.name ='diagonal';
			form.action = '/save-screen';
		} else if (item.checked && item.value === 'capacity') {
			sizeLabel.innerHTML= 'Capacity:';
			sizeInput.name ='capacityInSqMeters';
			form.action = '/save-pickUp';
		}
	}));
});