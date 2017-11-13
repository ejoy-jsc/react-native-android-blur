var { requireNativeComponent, View } = require('react-native');
var React = require('react');
import PropTypes from 'prop-types';

var iface = {
    name: 'BlurryOverlay',
    propTypes: {
        ...View.propTypes,
        radius: PropTypes.number,
        sampling: PropTypes.number,
        color: PropTypes.string,
    },
};

module.exports = requireNativeComponent('RCTBlurryOverlay', iface);