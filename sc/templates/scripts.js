    //const corsDemo= require('cors');
    //corsDemo();
        // var today = new Date();
        // var dd = today.getDate();
        // var mm = today.getMonth() + 1; //January is 0!
        // var yyyy = today.getFullYear();

        // if (dd < 10) {
        //     dd = '0' + dd;
        // }

        // if (mm < 10) {
        //     mm = '0' + mm;
        // }

        // today = yyyy + '-' + mm + '-' + dd;
        // document.getElementById("date").setAttribute("min", today);
        
        // var maxDate = new Date(Date.now() + 6 * 24 * 60 * 60 * 1000).toISOString().split('T')[0];
        // // Set the max attribute of the date input field
        // document.getElementById('date').setAttribute('max', maxDate);
        // //time slot
        // const bookingForm = document.getElementById('booking-form');
        // const bookingResult = document.getElementById('booking-result');
        // const timeSelect = document.getElementById('time');

        // // Generate time slots
        // function generateTimeSlots() {
        // const startTime = 9; // 9 am
        // const endTime = 20; // 8 pm
        // const interval = 2; // 2 hours
        
        // for (let i = startTime; i <= endTime; i += interval) {
        //     const timeString = `${i}:00`;
        //     const option = new Option(timeString, timeString);
        //     timeSelect.appendChild(option);
        // }
        // }

        // // Clear time slots
        // function clearTimeSlots() {
        // timeSelect.innerHTML = '<option value="" selected disabled>Select a time slot</option>';
        // }

        // // Event listener for date change
        // document.getElementById('date').addEventListener('change', function() {
        // clearTimeSlots();
        // // Here you can implement logic to fetch available time slots for the selected date from your backend API
        
        // // For demonstration purposes, let's assume we have some hardcoded available slots
        // const availableSlots = ['9:00', '12:00', '15:00', '18:00'];
        
        // // Populate available slots in the dropdown
        // availableSlots.forEach(slot => {
        //     const option = new Option(slot, slot);
        //     timeSelect.appendChild(option);
        // });
        // });

        // Event listener for form submission
        // bookingForm.addEventListener('submit', function(e) {
        // e.preventDefault();
        
        // const date = document.getElementById('date').value;
        // const time = timeSelect.value;
        
        // // Perform booking logic here or make an API call to book the slot
        
        // // Display the result message
        // bookingResult.textContent = `Slot booked: ${date} at ${time}`;
        // });

        // Generate time slots initially
        // generateTimeSlots();

        // function bookSlot()
        // {
        //     var dateInput = document.getElementById('date');
        //     var timeInput = document.getElementById('time');
            
        //     var selectedDate = dateInput.value;
        //     var selectedTime = timeInput.value;
            
        //     var dateTime = selectedDate + 'T' + selectedTime+':00';
            
            // var requestData = {
            //     id: 3,
            //     dateTime: dateTime
            // };
            // console.log(JSON.stringify(requestData));
            
            // var endpoint = 'http://10.104.181.237:8080/bookSlot'; // Replace with your API endpoint
            
            // fetch(endpoint, {
            //     method: 'POST',
            //     headers: {
            //         'Content-Type': 'application/json'
            //     },
            //     body: JSON.stringify(requestData)
            // })
            // .then(response => {
            //     if (response.ok) {
            //         return response.json();
            //     } else {
            //         throw new Error('Booking failed!');
            //     }
            // })
            // .then(data => {
            //     // Handle the response data as needed
            //     document.getElementById('booking-result').textContent = 'Booking successful!';
            // })
            // .catch(error => {
            //     // Handle errors
            //     document.getElementById('booking-result').textContent = error.message;
            // });
        // }
        
