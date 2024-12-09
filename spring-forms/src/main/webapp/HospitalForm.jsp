<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Hospital Form</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 50px;
        }
        .form-header {
            margin-bottom: 30px;
            text-align: center;
        }
        .form-header h1 {
            color: #343a40;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .btn-primary {
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form-header">
            <h1>Hospital Form</h1>
        </div>
        <form action="hospital" method="post" class="needs-validation" novalidate>
            <div class="form-group">
                <label for="patientId">Patient Id</label>
                <input type="number" class="form-control" id="patientId" name="patientId" required>
                <div class="invalid-feedback">Please enter a valid patient ID.</div>
            </div>
            <div class="form-group">
                <label for="patientName">Patient Name</label>
                <input type="text" class="form-control" id="patientName" name="patientName" required>
                <div class="invalid-feedback">Please enter the patient's name.</div>
            </div>
            <div class="form-group">
                <label for="admissionDate">Admission Date</label>
                <input type="date" class="form-control" id="admissionDate" name="admissionDate" required>
                <div class="invalid-feedback">Please enter the admission date.</div>
            </div>
            <div class="form-group">
                <label for="dischargeDate">Discharge Date</label>
                <input type="date" class="form-control" id="dischargeDate" name="dischargeDate" required>
                <div class="invalid-feedback">Please enter the discharge date.</div>
            </div>
            <div class="form-group">
                <label for="contactNumber">Contact Number</label>
                <input type="number" class="form-control" id="contactNumber" name="contactNumber" required>
                <div class="invalid-feedback">Please enter a valid contact number.</div>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        // Example starter JavaScript for disabling form submissions if there are invalid fields
        (function() {
            'use strict';
            window.addEventListener('load', function() {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation');
                // Loop over them and prevent submission
                var validation = Array.prototype.filter.call(forms, function(form) {
                    form.addEventListener('submit', function(event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            }, false);
        })();
    </script>
</body>
</html>
