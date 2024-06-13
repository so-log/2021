<template>
    <div>
        <div>{{ htmlString }}</div>
        <div v-html="htmlString"></div>
    </div>
</template>

<script>
export default {
    data() {
        return {
            htmlString : '<p style = "color:red">HTML으로 작성한 문장'
        };
    }
}
</script>
