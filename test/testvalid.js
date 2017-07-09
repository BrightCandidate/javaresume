var test = require('tape');
var validator = require ('resume-schema');
var fs = require('fs');

validator.resumeJson = JSON.parse(fs.readFileSync('src/test/resources/jsonresume.json', 'utf8'));

test('Javascript test validator for Java generated JsonResume.', function(t) {
    validator.validate(validator.resumeJson, function(report, err) {
        t.equal(err, null, 'No formatting errors');
        t.equal(report && report.valid, true, 'Passes JsonResume v1.0.0 specification - DRAFT.');
        t.end();
    });
});
