const express = require('express');
const router = express.Router();

router.use((req, res, next) => {
    res.locals.addCss = ["menu"];
    next();
});

router.get('/menu', (req, res) => {
    return res.render('main/menu');
});


module.exports = router;